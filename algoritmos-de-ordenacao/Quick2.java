public class Quick2 {
    // Implementacão Quick Sort versao da faculdade
    private static int trocas = 0;

    public static Resultado sort(int vetor[]) {
        sort(vetor, 0, vetor.length - 1);
        return new Resultado(vetor, trocas);
    }

    private static void sort(int vetor[], int i, int s) {
        int e = i, d = s;
        int item = vetor[((e + d) / 2)];

        while (e <= d) {
            while (vetor[e] < item)
                e++;
            while (vetor[d] > item)
                d--;

            if (e <= d) {
                int aux; // Variável auxiliar para as trocas
                aux = vetor[e];
                vetor[e] = vetor[d];
                vetor[d] = aux;
                trocas++;
                d--;
                e++;
            }
        }
        if (d - i > 0)
            sort(vetor, i, d);
        if (s - e > 0)
            sort(vetor, e, s);
    }
}
