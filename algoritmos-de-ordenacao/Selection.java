public class Selection {
    // Selection Sort - Complexidade O(n^2)
    private static int trocas = 0;
    
    public static Resultado sort(int[] vetor) {
        int aux, posicaoMenor;
        for (int i = 0; i < vetor.length; i++) {
            posicaoMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
            trocas++;
        }
        return new Resultado(vetor, trocas);
    }
}
