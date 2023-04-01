import java.util.Scanner;

public class alg465 {
    public static void verifica(int x1, int x2){
        if(x1<x2){
            System.out.println(x2);
        }else{
            System.out.println(x1);
        }
    }
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Entre com dois numero: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		System.out.println("O maior numero eh: ");
		verifica(num1, num2);

		input.close();
	}
}
