import java.util.Scanner;

public class alg485 {
    public static void multiplicaVetor(int[] vet1, String[] vet2, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.println();
            for (int w = 0; w < vet1[i]; w++) {
                System.out.print(vet2[i]);
            }
        }
    }
    public static void main(String[] args) {

		Scanner scan = new Scanner();

		
        int[] num = new int[6];
        String[] num1 = new String[6];
        for (int L = 0; L < 6; L++) {
            System.out.print("Digite o número " + (L+1) + ": ");
            num[L] = scan.nextInt();
        }
        for (int L = 0; L < 6; L++) {
            System.out.print("Digite o caractere " + (L+1) + ": ");
            num1[L] = scan.next();
        }
        System.out.println();
        multiplicaVetor(num, num1, 6);
        System.out.println();
    }

		scan.close();
	}

