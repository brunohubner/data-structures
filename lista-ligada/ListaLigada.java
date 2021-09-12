public class ListaLigada<TIPO> {
    // Lista Ligada que aceita qualquer tipo de dado
    // Os Elementos são equivalentes aos Nodes/Nós
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    public ListaLigada() {
        // Construtor de lista vazia
        this.tamanho = 0;
    }

    public Elemento<TIPO> getProximo() {
        // Pega o próximo Elemento encadeado
        if (this.tamanho == 0) {
            return null;
        } else if (this.tamanho == 1){
            return this.primeiro;
        } else {
            return this.primeiro.getProximo();
        }
    }

    public Boolean isEmpty() {
        // Verifica s eestá vazia
        return this.getTamanho() == 0;
    }

    public Elemento<TIPO> getPrimeiro() {
        // Pega o primeiro Elemento
        return primeiro;
    }

    public void setPrimeiro(Elemento<TIPO> primeiro) {
        // Define o primeiro Elemento
        this.primeiro = primeiro;
    }

    public Elemento<TIPO> getUltimo() {
        // Pega o último Elemento
        return ultimo;
    }

    public void setUltimo(Elemento<TIPO> ultimo) {
        // Define o Ultimo Elemento
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        // Pega o tamanho da lista
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        // Define o tamanho da lista
        this.tamanho = tamanho;
    }

    public void adicionar(TIPO novoValor) {
        // Adiciona um Elemento no fim da lista
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void adicionarComeco(TIPO novoValor) {
        // Adiciona um Elemento no início da lista
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            novoElemento.setProximo(this.primeiro);
            this.primeiro = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(TIPO valorProcurado) {
        // Remove um valor passado por parametro em qualquer
        // posição da lista
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;
        
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (this.getTamanho() == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                }
                else if (atual == this.primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == this.ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento<TIPO> get(int posicao) {
        // Procura o Elemento na lista através do indice recebido
        Elemento<TIPO> atual = this.primeiro;

        for(int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public IteratorListaLigada<TIPO> getIterator() {
        // Pega o Iterador da lista
        return new IteratorListaLigada<TIPO>(this.primeiro);
    }
}
