import java.util.Scanner;

public class alg460 {
    public static int dobro(int x){
        return x*2;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		int[] numeros = new int[3];

		System.out.println("Entre com 3 numeros");

		for (int i = 0; i < 3; i++){
            numeros[i] = input.nextInt();
			System.out.println("dobro: " + (int)dobro(numeros[i]));
        }

		input.close();

    }
}

