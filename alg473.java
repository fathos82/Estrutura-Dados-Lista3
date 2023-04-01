import java.util.Scanner;

public class alg473 {
    public static boolean maiuscula(String letra) {
        letra.toLowerCase();
        if (letra.equals("a") || letra.equals("e")|| letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um char: ");

		String c = scan.next();

		if (maiuscula(c)) {
			System.out.println("\nVogal");
		}

		else
			System.out.println("\nConsoante");

		scan.close();
	}
}
