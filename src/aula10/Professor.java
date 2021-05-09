package aula10;

public class Professor extends Pessoa{
    private String especialidade;
    private Float salario;

    // -------------------------------------------- Metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    // ---------------------------------------------- Metodos
    public void receberAum(Float valor){
        this.setSalario(this.getSalario() + valor);
    }
}
