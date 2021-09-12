public class Elemento<TIPO> {
    // Elemento equivalente aos Node/Nós da Árvore Binária
    // Todo Elemento sabe seu valor e quem são seus 2 filhos
    // Se ele tiver filhos...

    private TIPO valor;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;

    public Elemento(TIPO valor) {
        // Criando Elemento sem filhos
        this.setValor(valor);
        this.setEsquerda(null);
        this.setDireita(null);
    }

    // Métodos que pegam e definem quem são seus filhos e valores
    // tanto a esquerda quanto a direita
    public Elemento<TIPO> getDireita() {
        return direita;
    }

    public void setDireita(Elemento<TIPO> direita) {
        this.direita = direita;
    }

    public Elemento<TIPO> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<TIPO> esquerda) {
        this.esquerda = esquerda;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }
}
