public class Main {
    public static void main(String[] args) throws Exception {
        // Grafo direcional com arestas que tem peso e direcões
        // para diferentes vértices, como se fossem seguidores
        // de uma rede social. Veja o diagrama simples grafo.jpg

        clearScreen();
        Grafo<String> grafo = new Grafo<String>();

        // Adicionando Vértices no Grafo do Tipo String
        grafo.adicionarVertice("Bruno");
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Eduardo");
        grafo.adicionarVertice("Ana");
        grafo.adicionarVertice("Gabriel");
        grafo.adicionarVertice("Maria");
        grafo.adicionarVertice("Eduarda");
        grafo.adicionarVertice("Renato");
        grafo.adicionarVertice("Alice");
        grafo.adicionarVertice("Pedro");
        grafo.adicionarVertice("Bia");
        grafo.adicionarVertice("Lucas");
        
        // Adicionando Arestas no Grafo passando como parametros:
        // Peso da aresta, do tipo double;
        // Vertice Inicialdo tipo String;
        // Vertice Final do tipo String.
        // Não modificar essa ordem de adição de dados no grafo.
        // Dados adicionados exatamente conforme representado
        // no diagrama grafo.jpg
        grafo.adicionarAresta(2.0, "Bruno", "Paulo");
        grafo.adicionarAresta(2.0, "Bruno", "Ana");
        grafo.adicionarAresta(2.0, "Paulo", "Gabriel");
        grafo.adicionarAresta(1.0, "Eduardo", "Paulo");
        grafo.adicionarAresta(3.0, "Ana", "Paulo");
        grafo.adicionarAresta(1.0, "Ana", "Eduarda");
        grafo.adicionarAresta(2.0, "Gabriel", "Eduardo");
        grafo.adicionarAresta(3.0, "Gabriel", "Maria");
        grafo.adicionarAresta(1.0, "Maria", "Eduardo");
        grafo.adicionarAresta(2.0, "Maria", "Alice");
        grafo.adicionarAresta(3.0, "Maria", "Lucas");
        grafo.adicionarAresta(1.0, "Eduarda", "Bruno");
        grafo.adicionarAresta(2.0, "Eduarda", "Renato");
        grafo.adicionarAresta(2.0, "Eduarda", "Pedro");
        grafo.adicionarAresta(1.0, "Renato", "Bia");
        grafo.adicionarAresta(2.0, "Alice", "Gabriel");
        grafo.adicionarAresta(1.0, "Pedro", "Renato");
        grafo.adicionarAresta(3.0, "Renato", "Bia");
        grafo.adicionarAresta(2.0, "Bia", "Alice");
        grafo.adicionarAresta(1.0, "Lucas", "Bia");
        grafo.adicionarAresta(1.0, "Gabriel", "Ana");
        grafo.adicionarAresta(2.0, "Renato", "Ana");

        // Mostrando algumas informações do grafo:
        System.out.println("Vértice Bruno está no Grafo? " + grafo.buscar("Bruno"));
        System.out.println("Vértice Joana está no Grafo? " + grafo.buscar("Joana"));
        System.out.println(grafo.getConexao(0));
        System.out.println(grafo.getConexao(8));
        System.out.println(grafo.buscaEmLargura());
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
