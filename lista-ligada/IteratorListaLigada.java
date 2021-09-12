public class IteratorListaLigada<TIPO> {
    // O Iterador funciona como um índice para tornar a busca na lista linear

    private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO> atual) {
        this.elemento = atual;
    }

    public Boolean temProximo() {
        // Verifica se o Elemento tem um sucessor
        if (elemento.getProximo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public Elemento<TIPO> getProximo() {
        // Pega o sucessor
        elemento = elemento.getProximo();
        return elemento;
    }
}
