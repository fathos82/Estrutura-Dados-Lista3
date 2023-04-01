import java.util.Scanner;

public class alg467 {
    public static double loga(double base, double exp){
        return Math.log(base) / Math.log(exp);
    }
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor da base e do expoente: ");
		double base = scan.nextDouble();
		int exp = scan.nextInt();

		System.out.println("Logaritmo:" + loga(base, exp));

		scan.close();
	}
}
// REVER