public class MainClientes {
    public static void main(String[] args) {
        clearScreen();
        // Instanciando Lista Ligada do tipo Cliente
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();

        // Adicionando Clientes com Nome e CPF
        clientes.adicionar(new Cliente("Bruno", "12345678910"));
        clientes.adicionar(new Cliente("Ana", "10987654321"));
        clientes.adicionar(new Cliente("Paulo", "75375375312"));
        clientes.adicionar(new Cliente("Lucas", "15945675324"));
        clientes.adicionar(new Cliente("Maria", "85274596512"));
        clientes.adicionar(new Cliente("Layla", "85245687423"));

        mostrarCliente(clientes);
    }

    private static void mostrarCliente(ListaLigada<Cliente> clientes) {
        // Mostra CPF e Nome dos Clientes do terminal
        System.out.println("Lista completa:");
        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println("CPF: " + clientes.get(i).getValor().getCpf()
                + ". " + clientes.get(i).getValor().getNone());
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