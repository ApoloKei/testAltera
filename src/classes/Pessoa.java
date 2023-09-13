package classes;

public class Pessoa {
    private String nome;
    private String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String mostrarDados(){
        return "Nome: " + this.nome +
                "\nIdade: " + this.idade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }
}
