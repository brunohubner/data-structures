public class Quick {
    // Quick Sort - Complexidade O(n log(n))
    private static int trocas = 0;
    
    public static Resultado sort(int[] vetor) {
        sort(vetor, 0, vetor.length - 1);
        return new Resultado(vetor, trocas);
     }
 
     // Complementação Quick Sort
     private static void sort(int[] vetor, int esquerda, int direita) {
         if (esquerda < direita) {
             int p = particao(vetor, esquerda, direita);
             sort(vetor, esquerda, p);
             sort(vetor, p + 1, direita);
         }
     }
     
     // Complementação Quick Sort
     private static int particao(int[] vetor, int esquerda, int direita) {
         int meio = (int) (esquerda + direita) / 2;
         int pivot = vetor[meio];
         int i = esquerda - 1;
         int j = direita + 1;
         while (true) {
             do {
                 i++;
             } while (vetor[i] < pivot); 
             do {
                 j--;
             } while (vetor[j] > pivot);
 
             if (i >= j) return j;
 
             int aux = vetor[i];
             vetor[i] = vetor[j];
             vetor[j] = aux;
             trocas++;
         }
     }
}
