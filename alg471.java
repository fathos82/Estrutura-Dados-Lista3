import java.util.Scanner;

public class alg471 {
    public static int divisor(int x, int y){
        int r,n1 = 0; 
        
        r= x % y; 
        while(r == 0 ){
            n1++;
            x = x/y;
            r = x % y;
        }
        return n1;
    
    }
    
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o dividendo");

		int dividendo = scan.nextInt();
		int divisor = scan.nextInt();

		System.out.println(
				"quantidade de divisoes: " + divisor(dividendo, divisor));

                scan.close();
	}
}
