public class Resultado {
    // Retorna o números de trocas e tempo gasto
    public Resultado(int[] vetor, int trocas) {
        this.vetor = vetor;
        this.trocas = trocas;
    }
    
    private int[] vetor;
    private int trocas;

    public int[] getVetor() {
        return vetor;
    }

    public int getTrocas() {
        return trocas;
    }
}
