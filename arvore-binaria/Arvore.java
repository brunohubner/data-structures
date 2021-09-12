import java.util.ArrayList;

public class Arvore<TIPO extends Comparable<TIPO>> {
    // Arvore Binária de tipo genérico
    private Elemento<TIPO> raiz;

    public Arvore() {
        // Construtor cria Árvore vazia
        this.setRaiz(null);
    }

    public Elemento<TIPO> getRaiz() {
        // Retorna a Raiz da Árvore
        return raiz;
    }

    private void setRaiz(Elemento<TIPO> raiz) {
        // Define a Raiz da Árvore
        this.raiz = raiz;
    }

    public Boolean isEmpty() {
        return this.getRaiz() == null;
    }

    public void adicionar(TIPO valor) {
        // Adiciona um Elemento exatamente no lugar correto da Árvore
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        if (this.getRaiz() == null) {
            this.setRaiz(novoElemento);
        } else {
            Elemento<TIPO> atual = this.getRaiz();
            while (true) {
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                } else {
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    private boolean buscarRecursivamente(Elemento<TIPO> atual, TIPO valor) {
        // Percorre a Árvore recursivamente até encontrar o Elemento
        if (atual == null) {
            return false;
        } else if (valor == atual.getValor()) {
            return true;
        } else {
            return valor.compareTo(atual.getValor()) == -1
                ? buscarRecursivamente(atual.getEsquerda(), valor) 
                : buscarRecursivamente(atual.getDireita(), valor);
        }
    }

    public boolean buscar(TIPO valor) {
        // Busca um Elemento na Árvore
        return buscarRecursivamente(this.getRaiz(), valor);
    }

    private Elemento<TIPO> deletarRecursivamente(Elemento<TIPO> atual, TIPO valor) {
        // Procura um Elemento recursivamente para deleta-lo da Árvore
        if (atual == null) {
            return null;
        } else if (valor == atual.getValor()) {

            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                return null;
            } else if (atual.getEsquerda() == null) {
                return atual.getEsquerda();
            } else if (atual.getDireita() == null) {
                return atual.getDireita();
            }

            TIPO menorValor = procurarMenorElemento(atual.getDireita());
            atual.setValor(menorValor);
            atual.setDireita(deletarRecursivamente(atual.getDireita(), menorValor));
            return atual;

        } else if (valor.compareTo(atual.getValor()) == -1) {
            atual.setEsquerda(deletarRecursivamente(atual.getEsquerda(), valor));
            return atual;
        } else {
            atual.setDireita(deletarRecursivamente(atual.getDireita(), valor));
            return atual;
        }
    }

    private TIPO procurarMenorElemento(Elemento<TIPO> raiz) {
        // Procura o Elemento para substituir a posição do deletado
        return raiz.getEsquerda() == null 
            ? raiz.getValor() 
            : procurarMenorElemento(raiz.getEsquerda());
    }

    public void deletar(TIPO valor) {
        // Deleta um Elemento da Árvore
        deletarRecursivamente(this.getRaiz(), valor);
    }

    // ArrayList para retorno de todos os Elementos Árvore
    private ArrayList<TIPO> arvoreEmVetor = new ArrayList<TIPO>();

    public ArrayList<TIPO> emOrdem() {
        // Retorna Árvore Ordenada
        arvoreEmVetor.clear();
        emOrdem(this.getRaiz());
        return arvoreEmVetor;
    }

    private ArrayList<TIPO> emOrdem(Elemento<TIPO> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            arvoreEmVetor.add(atual.getValor());
            emOrdem(atual.getDireita());
        }
        return arvoreEmVetor;
    }
    
    public ArrayList<TIPO> preOrdem() {
        // Retorna Árvore Pré-Ordenada
        arvoreEmVetor.clear();
        preOrdem(this.getRaiz());
        return arvoreEmVetor;
    }

    private ArrayList<TIPO> preOrdem(Elemento<TIPO> atual) {
        if (atual != null) {
            arvoreEmVetor.add(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
        return arvoreEmVetor;
    }

    public ArrayList<TIPO> posOrdem() {
        // Retorna Árvore pós-Ordenada
        arvoreEmVetor.clear();
        posOrdem(this.getRaiz());
        return arvoreEmVetor;
    }

    private ArrayList<TIPO> posOrdem(Elemento<TIPO> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            arvoreEmVetor.add(atual.getValor());
        }
        return arvoreEmVetor;
    }
}
