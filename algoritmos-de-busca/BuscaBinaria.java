import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) throws Exception {
        clearScreen();
        // Tamanho do vetor que será preenchido a ordenadamente com inteiros
        // a partir do número 1. Altere o tamanho e faça seus testes.
        int tamanho = 10;
        int[] vetor = new int[tamanho];

        preencherVetor(vetor);
        buscaBinaria(inputBusca(), vetor);
    }

    // Busca Binária - Complexidade O(log n)
    private static void buscaBinaria(int busca, int[] vetor) {
        Boolean achou = false;
        int inicio = 0;
        int meio;
        int fim = vetor.length - 1;
        int qtdeTentativas = 0;

        while (inicio <= fim) {
            qtdeTentativas++;
            meio = (int)((inicio + fim) / 2);
            if (busca == vetor[meio]) {
                achou = true;
                break;
            } else if (busca > vetor[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (achou) 
            System.out.printf("Número encontrado com %d tentativas!", qtdeTentativas);
        else
            System.out.printf("Número não encontrado com %d tentativas!", qtdeTentativas);
    }

    private static int inputBusca() {
        // Pega o input do usuário no terminal
        // Deve ser um inteiro
        Scanner scan = new Scanner(System.in);
        System.out.print("\n>> Buscar número: ");
        int busca = scan.nextInt();
        scan.close();
        return busca;
    }

    private static void preencherVetor(int[] vetor) {
        // Preenche o vetor sequencialmente com inteiros de 1 até o tamanho informado
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
    }

    public static void clearScreen() {
        // Limpa o Terminal
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
