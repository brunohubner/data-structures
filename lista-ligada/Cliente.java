public class Cliente {
    // Classe de Clientes apenas para exemplificar que a lista ligada
    // funciona com qualquer tipo de dado por ser genérica

    private String nome;
    private String cpf;

    public Cliente() {
        this.setNome("Sem nome");
        this.setCpf("00000000000");
    }

    public Cliente(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNone() {
        return this.nome;
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public String toString() {
        return this.nome;
    }
}
