public class Merge {
    // Merge Sort - Complexidade O(n log(n))
    private static int trocas = 0;

    public static Resultado sort(int[] vetor) {
        sort(vetor, 0, vetor.length - 1);
        return new Resultado(vetor, trocas);
    }

    private static void sort(int[] vetor, int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (int) (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
    // Complementação Merge Sort

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[vetor.length];
        int i, j, k;
        int tamanho = fim - inicio + 1;
        int p1 = inicio;
        int p2 = meio + 1;
        int fim1 = 0, fim2 = 0;

        if (temp != null) {
            for (i = 0; i < tamanho; i++) {
                if (fim1 == 0 && fim2 == 0) {
                    if (vetor[p1] < vetor[p2]) {
                        temp[i] = vetor[p1++];
                        trocas++;
                    } else {
                        temp[i] = vetor[p2++];
                        trocas++;
                    }

                    if (p1 > meio) fim1 = 1;
                    if (p2 > fim) fim2 = 1;
                } else {
                    if (fim1 == 0) {
                        temp[i] = vetor[p1++];
                        trocas++;
                    } else {
                        temp[i] = vetor[p2++];
                        trocas++;
                    }
                }
            }
            j = 0;
            k = inicio;
            while (j < tamanho) {
                vetor[k] = temp[j];
                j++;
                k++;
                trocas++;
            }
        }
    }
}
