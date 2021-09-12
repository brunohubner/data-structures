import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        clearScreen();
        // Instanciando Árvore Binaria do tipo Inteiro
        Arvore<Integer> arvore = new Arvore<Integer>();

        // Adicionando Elementos na Árvore Binária.
        // Não modificar essa ordem de inserção dos elementos na árvore,
        // pois os elementos já foram inseridos de forma que a Árvore Binaria
        // fique balanceada exatamente como desenhado no diagrama arvore.jpg

        arvore.adicionar(15);
        arvore.adicionar(8);
        arvore.adicionar(24);
        arvore.adicionar(4);
        arvore.adicionar(20);
        arvore.adicionar(13);
        arvore.adicionar(27);
        arvore.adicionar(2);
        arvore.adicionar(17);
        arvore.adicionar(7);
        arvore.adicionar(22);
        arvore.adicionar(10);
        arvore.adicionar(25);
        arvore.adicionar(14);
        arvore.adicionar(30);

        // Imprimindo a Arvore Binária em Ordem e deletando alguns Elementos
        imprimir(arvore.emOrdem());
        arvore.deletar(20);
        imprimir(arvore.emOrdem());
        arvore.deletar(8);
        imprimir(arvore.emOrdem());
        arvore.deletar(30);
        imprimir(arvore.emOrdem());

        // Busca em Árvore Binária
        System.out.println("Tem o Elemento 13? " + arvore.buscar(13));
        System.out.println("Tem o Elemento 35? " + arvore.buscar(35));
        System.out.println("Raiz da Arvore: " + arvore.getRaiz().getValor());
        System.out.println("Está vazia? " + arvore.isEmpty());

        // Outros Métodos:
        // arvore.preOrdem();
        // arvore.posOrdem();
    }
    
    private static void imprimir(ArrayList<Integer> vetor) {
        // Imprime qualquer ArrayList
        for (Integer elemento : vetor) {
            System.out.print(elemento.toString() + ", ");
        }
        System.out.println();
    }

    public static void clearScreen() {
        // Limpa o Terminal
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
