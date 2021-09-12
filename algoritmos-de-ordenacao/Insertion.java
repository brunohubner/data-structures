public class Insertion {
    // Insertion Sort - Complexidade O(n^2)
    private static int trocas;

    public static Resultado sort(int[] vetor) {
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
                trocas++;
            }
            vetor[j + 1] = aux;
            trocas++;
        }
        return new Resultado(vetor, trocas);
    }
}
