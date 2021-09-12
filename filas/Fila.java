public class Fila<TIPO> {
    // Esta implentacção de Fila faz o uso das classes Lista Ligada
    // que estao aqui no repositório em:
    // algoritmos-e-estruturas-de-dados/lista-ligada
    // sem essas classes de Lista Ligada a classe Fila não funcionará.
    // Porém você também pode implementar uma Fila usando ArrayLists.

    private ListaLigada<TIPO> lista;
    private int tamanho;

    public Fila(){
        // Contrutor de Fila genérica
        this.lista = new ListaLigada<TIPO>();
        this.tamanho = 0;
    }

    public void adicionar(TIPO novoValor) {
        // Adiciona ao fim da Fila
        this.lista.adicionar(novoValor);
        tamanho++;
    }

    public void remover() {
        // Remove no início da Fila
        this.lista.remover(this.get());
        tamanho--;
    }

    public TIPO get() {
        // Pega o Primeiro da Fila
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.getPrimeiro().getValor();
        }
    }

    public TIPO get(int posicao) {
        // Pega um Elemento em qualquer posição da Fila
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.get(posicao).getValor();
        }
    }

    public TIPO getProximo() {
        // Pega o Segundo da Fila
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.getProximo().getValor();
        }
    }
    
    public TIPO getUltimo() {
        // Pega o Ultimo da Fila
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.getUltimo().getValor();
        }
    }

    public int getTamanho() {
        // Retorna o Tamanho da Fila
        return this.tamanho;
    }

    public Boolean isEmpty() {
        // Verifica se a Fila está vazia
        return this.getTamanho() == 0;
    }

    public String print() {
        // Imprime no terminal a Fila em ordem
        if (!this.isEmpty()) {
            String resp = "";

            for (int i = 0; i < this.getTamanho(); i++) {
                resp += this.get(i).toString() + ", ";
            }

            return resp;
        } else {
            return "Fila vazia";
        }
    }
}
