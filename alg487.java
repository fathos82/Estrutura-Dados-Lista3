import java.util.Scanner;

public class alg487 {
    public static void inverteVetor(int[] vetor, int maximo) {
        int k = maximo;
        for (int i = 0; i < maximo/2; i++) {
            int aux = vetor[i];
            k--;
            vetor[i] = vetor[k];
            vetor[k] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = scann.nextInt();
        }
        inverteVetor(numeros, 10);
        System.out.println("\nVETOR\n");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + numeros[i]);
        }
        scann.close();
    }

}
