package model;

public class AlienModel {
    private String nome;

    public AlienModel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "AlienModel{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
