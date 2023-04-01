import java.util.Scanner;


public class alg494 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[3];
        String[] enderecos = new String[3];
        String[] profissoes = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = scan.nextLine();
            System.out.print("Digite o endereço: ");
            enderecos[i] = scan.nextLine();
            System.out.print("Digite a profissão: ");
            profissoes[i] = scan.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    troca(nomes, i, j);
                    troca(enderecos, i, j);
                    troca(profissoes, i, j);
                }
            }
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + "\t" + enderecos[i] + "\t" + profissoes[i]);
        }
    }

    public static void troca(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

