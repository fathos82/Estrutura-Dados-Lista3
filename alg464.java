public class alg464 {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor em radiano: ");

		double angle = scan.nextDouble();

		System.out.println("O valor em radiano eh: " + Mathf.toDeg(angle));

		scan.close();
	}
}
