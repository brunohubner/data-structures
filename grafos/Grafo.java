import java.util.ArrayList;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        // Criando Grafo com ArrayLists para Vértices e Arestas
        this.setVertices(new ArrayList<Vertice<TIPO>>());
        this.setArestas(new ArrayList<Aresta<TIPO>>());
    }

    // Interface Privada:
    // Getters e Setters

    private ArrayList<Aresta<TIPO>> getArestas() {
        return arestas;
    }

    private void setArestas(ArrayList<Aresta<TIPO>> arestas) {
        this.arestas = arestas;
    }

    private ArrayList<Vertice<TIPO>> getVertices() {
        return vertices;
    }

    private void setVertices(ArrayList<Vertice<TIPO>> vertices) {
        this.vertices = vertices;
    }
    
    private Vertice<TIPO> getVertice(TIPO dado) {
        // Retorna o Vertice procurado pelo tipo de dado
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.getVertices().size(); i++) {
            if (this.getVertices().get(i).getDado().equals(dado)) {
                vertice = this.getVertices().get(i);
                break;
            }
        }
        return vertice;
    }

    private int getIndiceVertice(Vertice<TIPO> vertice) {
        // Retorna o indice do Vértice procurado
        int indice = -1;
        for (int i = 0; i < this.getVertices().size(); i++) {
            if (this.getVertices().contains(vertice)) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    // Interface Pública:

    public void adicionarVertice(TIPO dado) {
        // Adiciona Vértice no Grafo
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.getVertices().add(novoVertice);
    }
    
    public void adicionarAresta(Double peso, TIPO verticeInicio, TIPO verticeFim) {
        // Adiciona Aresta no Grafo
        Vertice<TIPO> inicio = this.getVertice(verticeInicio);
        Vertice<TIPO> fim = this.getVertice(verticeFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        int indiceVerticeInicio = getIndiceVertice(inicio);
        this.getVertices().get(indiceVerticeInicio).getVisinhos().add(fim);
        this.getArestas().add(aresta);
    }    

    public Boolean buscar(TIPO dado) {
        // Busca um Vértice no Grafo
        return this.getVertice(dado) != null ? true : false;
    }

    public String buscaEmLargura() {
        // Busca percorrendo todo o Grafo
        String resposta = "";
        if (this.getVertices().size() > 0) {
            ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
            ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
            Vertice<TIPO> atual = this.getVertices().get(0);
            marcados.add(atual);
            resposta = "[ " + atual.getDado() + ", ";
            fila.add(atual);

            while (fila.size() > 0) {
                Vertice<TIPO> visitado = fila.get(0);
                for (int i = 0; i < visitado.getVisinhos().size(); i++) {
                    Vertice<TIPO> proximo = visitado.getVisinhos().get(i);
                    if (!marcados.contains(proximo)) { // se o vértice ainda não foi marcado
                        marcados.add(proximo);
                        resposta += proximo.getDado() + ", ";
                        fila.add(proximo);
                    }
                }
                fila.remove(0);
            }
            resposta += "]";
        } else {
            resposta = "Grafo Vazio!";
        }
        return resposta;
    }

    public String getConexao(int indiceAresta) {
        // Retorna a conexão criada entre 2 Vértices
        String conexao = "";
        if (indiceAresta >= 0 && indiceAresta < this.getArestas().size()) {
            conexao = "[ " + this.getArestas().get(indiceAresta).getPeso().toString() + ", " + 
            this.getArestas().get(indiceAresta).getInicio().getDado() + ", " + 
            this.getArestas().get(indiceAresta).getFim().getDado() + " ]";
        } else {
            conexao = "Aresta não encontrada";
        }
        return conexao;
    }
}
