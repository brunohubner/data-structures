import java.util.ArrayList;

public class Vertice<TIPO> {
    // Vértice genérico. Ele sabe a direção das arestas.
    // e sabe também quem são seus vértices visinhos.

    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestasEntrada;
    private ArrayList<Aresta<TIPO>> arestasSaida;
    private ArrayList<Vertice<TIPO>> visinhos;

    public Vertice(TIPO dado) {
        this.setDado(dado);
        this.setArestasEntrada(new ArrayList<Aresta<TIPO>>());
        this.setArestasSaida(new ArrayList<Aresta<TIPO>>());
        this.setVisinhos(new ArrayList<Vertice<TIPO>>());
    }

    // Getters e Setters:
    
    public ArrayList<Vertice<TIPO>> getVisinhos() {
        return visinhos;
    }

    public void setVisinhos(ArrayList<Vertice<TIPO>> visinhos) {
        this.visinhos = visinhos;
    }

    public ArrayList<Aresta<TIPO>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<TIPO>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }

    public ArrayList<Aresta<TIPO>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<TIPO>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
        this.getArestasEntrada().add(aresta);
    }

    public void adicionarArestaSaida(Aresta<TIPO> aresta) {
        this.getArestasSaida().add(aresta);
    }
}
