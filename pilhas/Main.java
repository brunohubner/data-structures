public class Main {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Pilha<String> pilha = new Pilha<String>();

        // Adicionando elementos na Pilha
        // Por exemplos Livros, do tipo String
        pilha.adicionar("Livro 1");
        pilha.adicionar("Livro 2");
        pilha.adicionar("Livro 3");
        pilha.adicionar("Livro 4");
        pilha.adicionar("Livro 5");
        pilha.adicionar("Livro 6");

        // Mostra informações da Pilha no terminal
        System.out.println("Topo da Pilha: " + pilha.get());
        System.out.println("Segundo de cima pra baixo: " + pilha.getProximo());
        System.out.println("Embaixo de todos: "+ pilha.getUltimo());
        System.out.println("Pilha vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da Pilha: " + pilha.getTamanho());
        System.out.println("Pilha completa: " + pilha.print());
    }

    public static void clearScreen() {
        // Limpa o terminal
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
