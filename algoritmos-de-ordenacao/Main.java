public class Main {
    public static void main(String[] args) throws Exception {
        // Método que limpa o Terminal
        clearScreen();

        // Quantidade de elementos do vetor que será ordenado
        // Altere e faça seus testes
        int tamanho = 100;
        int[] vetor = new int[tamanho];

        // Retorno com tempo gasto na ordenaçã e numeros de trocas
        // entre os indices
        Resultado resultado;
        long inicio, fim;

        // Método que preenche todo o vetor
        // parametros disponiveis:
        // "ordenado" "reverso" "igual"
        preencherVetor(vetor);
        // preencherVetor(vetor, "ordenado");
        // preencherVetor(vetor, "igual");
        // preencherVetor(vetor, "reverso");

        // Imprime o vetor antes e depois da ordenação
        imprimirVetor(vetor);
        resultado = Quick.sort(vetor.clone());
        imprimirVetor(resultado.getVetor());

        // Outputs no terminal com o tempo e o
        // número de trocas de indices
        System.out.print("Bublle Sort    ");
        inicio = System.currentTimeMillis();
        resultado = Bubble.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());

        System.out.print("Insertion Sort ");
        inicio = System.currentTimeMillis();
        resultado = Insertion.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());

        System.out.print("Selection Sort ");
        inicio = System.currentTimeMillis();
        resultado = Selection.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());

        System.out.print("Merge Sort     ");
        inicio = System.currentTimeMillis();
        resultado = Merge.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());

        System.out.print("Shell Sort     ");
        inicio = System.currentTimeMillis();
        resultado = Shell.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());

        System.out.print("Heap Sort      ");
        inicio = System.currentTimeMillis();
        resultado = Heap.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());
            
        System.out.print("Quick Sort     ");
        inicio = System.currentTimeMillis();
        resultado = Quick.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());
        
        System.out.print("Quick2 Sort    ");
        inicio = System.currentTimeMillis();
        resultado = Quick2.sort(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.printf("Tempo: % 6d ms. Trocas: %d\n", 
            fim - inicio, resultado.getTrocas());
    }

    // Imprime o vetor no terminal
    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("\n");
    }

    // Preenche o vetor com inteiros aleatórios
    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * (vetor.length + 1));
        }
    }

    // Preenche o vetor seguindo os parametros
    public static void preencherVetor(int[] vetor, String opcao) {
        if (opcao.equalsIgnoreCase("ordenado")) {
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = i;
            }
        } else if (opcao.equalsIgnoreCase("reverso")) {
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = vetor.length - 1 - i;
            }
        } else if (opcao.equalsIgnoreCase("igual")) {
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = 1;
            }
        } else {
            preencherVetor(vetor);
        }
    }

    // Limpa o terminal antes da execução
    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}