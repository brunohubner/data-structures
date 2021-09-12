public class Main {
    public static void main(String[] args) throws Exception {
        clearScreen();
        // Lista Instanciada
        ListaLigada<String> lista = new ListaLigada<String>();

        // Adicionado elementos na lista
        // Siglas de Estados Brasileiros por exemplo:
        lista.adicionar("MG");
        lista.adicionar("ES");
        lista.adicionar("RJ");
        lista.adicionar("SP");
        lista.adicionar("AM");
        lista.adicionar("CE");
        lista.adicionar("BA");
        lista.adicionar("PE");
        lista.adicionar("RS");
        lista.adicionar("AC");
        
        // Vendo Informações da lista
        infoLista(lista);
        mostrarLista(lista);

        // Removendo Elementos na lista
        lista.remover("RJ");
        lista.remover("ES");
        lista.remover("SP");

        // Vendo informações novamente
        infoLista(lista);
        mostrarLista(lista);
    }

    private static void infoLista(ListaLigada<String> lista) {
        // Informações da Lista
        System.out.println("\nTamanho da lista: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
    }

    private static void mostrarLista(ListaLigada<String> lista) {
        // Mostra a lista completa
        System.out.println("\nLista Completa:");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i).getValor());
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
