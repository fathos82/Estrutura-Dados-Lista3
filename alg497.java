import java.util.Scanner;

public class alg497 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int n, c;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            num[i] = scan.nextInt();
        }
        
        System.out.print("Digite o número a ser buscado: ");
        n = scan.nextInt();
        
        ordena(num, 10);
        
        System.out.println("\nVETOR ORDENADO");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + num[i]);
        }
        
        c = busca(num, 10, n) + 1;
        
        if (c != 0) {
            System.out.println("\nPosição do número no vetor: " + c);
        } else {
            System.out.println("\nNúmero não encontrado no vetor.");
        }
    }
    
    public static void ordena(int[] vetor, int t) {
        for (int i = 0; i < t-1; i++) {
            for (int j = i+1; j < t; j++) {
                if (vetor[i] > vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
    
    public static int busca(int[] vetor, int tam, int chave) {
        int ini = 0;
        int fim = tam-1;
        
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            
            if (chave == vetor[meio]) {
                return meio;
            } else if (chave < vetor[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        
        return -1;
    }
}
