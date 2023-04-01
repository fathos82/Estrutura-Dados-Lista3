import java.util.Scanner;

public class alg481 {
    public static int converte(int nnum, int nbase) {
        int nb = 0;
        int r, b = 0;
        while (nnum >= nbase) {
            r = nnum % nbase;
            nb += Math.pow(10, b) * r;
            nnum /= nbase;
            b++;
        }
        nb += Math.pow(10, b) * nnum;
        return nb;
    }
    public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int num, base, c;
		System.out.println("\nDigite um valor maior que zero: ");
		num = scann.nextInt();

		while (num < 0) {
			System.out.println("\nmenor que zero, digite denovo: ");
			num = scann.nextInt();
		}

		System.out.println("Digite a base de conversão [2-10]: ");
		base = scann.nextInt();

		while (base < 2 || base > 10) {
			System.out.println("Nao sei converter, digite uma base entre 2 e 10");
			base = scann.nextInt();
		}

		c = converte(num, base);

		System.out.println("Numero em decimal: " + num);
		System.out.println("\nNumero na base " + base + ": " + c);

		scann.close();
	}
}
