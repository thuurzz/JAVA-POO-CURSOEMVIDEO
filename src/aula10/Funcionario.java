package aula10;

public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    // -------------------------------------------- Metodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // ---------------------------------------------- Metodos
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
}
