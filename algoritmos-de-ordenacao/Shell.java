public class Shell {
    // Shell Sort - Complexidade O(n(log(n))^2)
    private static int trocas = 0;

    public static Resultado sort(int[] vetor) {
        int h = 1;
        int n = vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = (int)(Math.floor(h / 3));

        int elemento, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                elemento = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > elemento) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                    trocas++;
                }
                vetor[j] = elemento;
                trocas++;
            }
            h = h / 2;
        }
        return new Resultado(vetor, trocas);
    }
}
