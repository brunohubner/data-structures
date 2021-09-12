public class MainInteiros {
    public static void main(String[] args) {
        clearScreen();
        ListaLigada<Integer> numeros = new ListaLigada<Integer>();

        // Adicionando Inteiros
        numeros.adicionar(8);
        numeros.adicionar(4);
        numeros.adicionar(7);
        numeros.adicionar(3);
        numeros.adicionar(6);
        numeros.adicionar(2);
        numeros.adicionar(9);
        numeros.adicionar(1);

        mostrarNumeros(numeros);
    }
    
    private static void mostrarNumeros(ListaLigada<Integer> numeros) {
        // Mostra a lista completa
        System.out.println("Lista Completa:");
        for (int i = 0; i < numeros.getTamanho(); i++) {
            System.out.println("Elemento " + i + ": " + numeros.get(i).getValor());
        }
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