import java.util.Scanner;

public class alg483 {

    public static int produtoInterno(int[] vet1, int[] vet2, int quant) {
        int prod = 0;
        for (int i = 0; i < quant; i++) {
            prod += vet1[i] * vet2[i];
        }
        return prod;
    }
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] v1 = new int[4];
		int[] v2 = new int[4];

		System.out.println("Digite os valores do vetor 1");

		for (int i = 0; i < v1.length; i++) {
			v1[i] = scan.nextInt();
		}

		System.out.println("Digite os valores do vetor 2");
		for (int i = 0; i < v2.length; i++) {

			v2[i] = scan.nextInt();
		}

		int produto = produtoInterno(v1, v2, 4);

		System.out.println("O produto interno dos dois vetores eh: " + produto);

		scan.close();
	}
}
