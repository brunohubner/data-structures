public class Elemento<TIPO> {
    // O Elemento/Node só sabe seu valor e quem é
    // seu proximo elemento na lista
    private TIPO valor;
    private Elemento<TIPO> proximo;

    public Elemento(TIPO novoValor) {
        this.setValor(novoValor);
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO novoValor) {
        this.valor = novoValor;
    }

    public Elemento<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }
}
