public class Pilha<TIPO> {
    // Esta implentacção de Pilha faz o uso das classes Lista Ligada
    // que estao aqui no repositório em:
    // algoritmos-e-estruturas-de-dados/lista-ligada
    // sem essas classes de Lista Ligada a classe Pilha não funcionará.
    // Porém você também pode implementar uma Pilha usando ArrayLists.
    
    private ListaLigada<TIPO> lista;
    private int tamanho;

    public Pilha(){
        // Construtor de Pilha Genérica
        this.lista = new ListaLigada<TIPO>();
        this.tamanho = 0;
    }

    public void adicionar(TIPO novoValor) {
        // Adiciona no topo da Pilha
        this.lista.adicionarComeco(novoValor);
        tamanho++;
    }

    public void remover() {
        // Remove no topo da Pilha
        this.lista.remover(this.get());
        tamanho--;
    }

    public TIPO get() {
        // Pega o topo da Pilha
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.getPrimeiro().getValor();
        }
    }

    public TIPO get(int posicao) {
        // Pega um Elemento em qualquer posição da Pilha
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.get(posicao).getValor();
        }
    }

    public TIPO getProximo() {
        // Pega o elemento abaixo do Topo da Pilha
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.getProximo().getValor();
        }
    }
    
    public TIPO getUltimo() {
        // Pega o Primeiro Elemento adicionado, no caso o debaixo de todos
        if (this.isEmpty()) {
            return null;
        } else {
            return this.lista.getUltimo().getValor();
        }
    }

    public int getTamanho() {
        // Retorna o tamanho da Pilha
        return this.tamanho;
    }

    public Boolean isEmpty() {
        // Verifica se a Pilha está vazia
        return this.getTamanho() == 0;
    }

    public String print() {
        // Imprime toda a pilha no terminal
        if (!this.isEmpty()) {
            String resp = "";

            for (int i = 0; i < this.getTamanho(); i++) {
                resp += this.get(i).toString() + ", ";
            }

            return resp;
        } else {
            return "Pilha vazia";
        }
    }
}
