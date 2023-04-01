import java.util.Scanner;

public class alg493 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, c, x;
        int[] numeros = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        c = verificarOrdem(numeros, 10);

        if (c == 1) {
            System.out.println("\nORDENAÇÃO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENAÇÃO DECRESCENTE");
        } else {
            System.out.println("\nNÃO ESTÁ ORDENADO");
        }
    }

    public static int buscarCrescente(int[] vetor, int tamanho) {
        int i, x;
        for (i = 0; i < tamanho - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }

    public static int buscarDecrescente(int[] vetor, int tamanho) {
        int i, x;
        for (i = 0; i < tamanho - 1; i++) {
            if (vetor[i] < vetor[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }

    public static int verificarOrdem(int[] vetor, int tamanho) {
        int resultado, resposta;
        resultado = buscarCrescente(vetor, tamanho);
        if (resultado == 1) {
            resposta = 2;
            return resposta;
        } else {
            resultado = buscarDecrescente(vetor, tamanho);
            if (resultado == 1) {
                resposta = 1;
                return resposta;
            } else {
                resposta = 0;
                return resposta;
            }
        }
    }
}
