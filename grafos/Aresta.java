public class Aresta<TIPO> {
    // As Arestas sabem seu peso e em quais Vértices estão ligadas

    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;
    
    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.setPeso(peso);
        this.setInicio(inicio);
        this.setFim(fim);
    }

    // Getters e Setters:

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
