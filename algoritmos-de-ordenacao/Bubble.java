public class Bubble {
    // Bubble Sort - Complexidade O(n^2)
    private static int trocas = 0;
    
    public static Resultado sort(int[] vetor) {
        int swap = 0;
        for (int i = 0; i < vetor.length; i++){
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    swap = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = swap;
                    trocas++;
                }
            }
        }
        return new Resultado(vetor, trocas);
    }
}