import java.util.Scanner;

public class alg462 {
    public static double media(double[] values){
        int i;
        double soma=0;
        for (i=0 ; i < values.length; i++) {
            soma+=values[i];
        } 
        return soma/i;
    }

    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas = new double[3];

		System.out.println("Entre com 3 notas: ");

		for (int i = 0; i < 3; i++) {
			notas[i] = scan.nextDouble();
		}

		System.out.println("Media: " + media(notas));

		scan.close();
}
}
