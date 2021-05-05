package aula09;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Character sexo;

    // Metodos especiais
    public void fazerAniver(){
        setIdade(getIdade() + 1);
    }

    // Construtor, getters e setters
    public Pessoa(String nome, Integer idade, Character sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
}
