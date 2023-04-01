import java.util.Scanner;

public class alg480 {
    public static int reverso(int num) {
        int soma = 1; 
        int r = 0;
        while (num != 0) {
            r = num % 10;
            soma *= 10+r;
            num /=  10;
        }
        return soma;
    }
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero.");

		int n = input.nextInt();

		if (reverso(n) == n) {
			System.out.println("Capicua detectada");
		} else
			System.out.println("Nao e uma capicua");

		input.close();
	}
}
