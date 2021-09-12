import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) throws Exception {
        clearScreen();
        // Tamanho do Vetor. Altere e faça seus testes
        int tamanho = 100;
        int[] vetor = new int[tamanho];

        // Preenche o Vetor com inteiros aleatórios
        // e procura no Vetor com base no input do
        // usuário no terminal
        preencherVetor(vetor);
        buscaLinear(inputNumero(), vetor);
    }

    // Busca Linear - Complexidade O(n)
    private static void buscaLinear(int busca, int[] vetor) {
        // Percorre todo o vetor a partir do inicio até encontrar o elemento
        Boolean achou = false;
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (busca == vetor[i]) {
                achou = true;
                indice = i;
                break;
            }
        }
        if (achou) 
            System.out.println("Número encontrado no indice " + indice + ".");
        else
            System.out.println("Número não encontrado no vetor!");
    }

    private static int inputNumero() {
        // Pega o input do usuário no terminal para realizar a busca linear
        Scanner scan = new Scanner(System.in);
        System.out.print("\n>> Buscar número: ");
        int busca = scan.nextInt();
        scan.close();
        return busca;
    }

    private static void preencherVetor(int[] vetor) {
        // Preenche o vetor com inteiros aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 101);
            System.out.printf("%d, ", vetor[i]);
        }
    }

    public static void clearScreen() {
        // Limpa o terminal
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
