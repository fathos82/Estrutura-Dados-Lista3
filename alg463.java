import java.util.Scanner;


public class alg463 {
    public static double radiano(double value){
        return value * 3.14 /180;
    }
    public static void main(String[] args) {

        

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite em graus: ");

		double angle = scan.nextDouble();

		System.out.println("Em radianos: " + radiano(angle));

		scan.close();
	}
}
