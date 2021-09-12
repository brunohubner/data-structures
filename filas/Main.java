public class Main {
    public static void main(String[] args) throws Exception {
        clearScreen();
        Fila<String> fila = new Fila<String>();

        // Adicionados elementos na Fila
        fila.adicionar("Pedro");
        fila.adicionar("Bruno");
        fila.adicionar("Ana");
        fila.adicionar("Bia");
        fila.adicionar("Lucas");
        fila.adicionar("Poul");
        fila.adicionar("Maria");
        fila.adicionar("Gabriel");
        fila.adicionar("Alex");

        // Remove sempre o primeiro da fila, no caso "Bruno"
        fila.remover();

        // Informações da fila
        System.out.println("Primeiro da Fila: " + fila.get());
        System.out.println("Segundo da Fila: " + fila.getProximo());
        System.out.println("Último da Fila: " + fila.getUltimo());
        System.out.println("Fila vazia? " + fila.isEmpty());
        System.out.println("Tamanho da Fila: " + fila.getTamanho());
        System.out.println("Fila completa: " + fila.print());
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
