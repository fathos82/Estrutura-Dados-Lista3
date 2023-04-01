import java.util.Scanner;

public class alg490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite palavra em letras minusculas " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
            int cont = contarLetra(palavras, palavras[i].length(), "c");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + palavras[i]);
        }
    }

    public static int contarLetra(String[] vetor, int tamanho, String letra) {
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(letra)) {
                vetor[i] = "u1*I";
                cont++;
            }
        }
        return cont;
    }
}

    

   

    

