package aula07;


public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    // Métodos
    public Lutador(String nome, String nacionalidade, Integer idade, Double altura, Double peso, Integer vitorias, Integer derrotas, Integer empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2){
            this.categoria = "Inválido";
        } else if (peso <= 70.3){
            this.categoria = "Leve";
        } else if (peso <= 83.9){
            this.categoria = "Médio";
        } else if (peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.print("===========LUTADOR=============\n");
        System.out.printf("Lutador: %s \n", this.getNome());
        System.out.printf("Origem: %s \n", this.getNacionalidade());
        System.out.printf("Idade: %s anos \n", this.getIdade());
        System.out.printf("Altura: %s m \n", this.getAltura());
        System.out.printf("Pesando: %s Kg \n", this.getPeso());
        System.out.printf("Ganhou: %s \n", this.getVitorias());
        System.out.printf("Perdeu: %s \n", this.getDerrotas());
        System.out.printf("Empatou: %s \n", this.getEmpates());
        System.out.println();
    }
    public void status(){
        System.out.println(this.getNome() + " | Categoria Peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println();
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
