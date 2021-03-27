package aula03;

public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tamapda? " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada){
            System.out.println("Caneta " + this.modelo + " tampada, não pode rabiscar...");
        } else {
            System.out.println("Rabiscando...");
        }

    }

    protected void tampar(){
        this.tampada = true;
        System.out.println("Caneta " + this.modelo + " foi tampada.");
    }

    protected void destampar(){
        this.tampada = false;
        System.out.println("Caneta " + this.modelo + " foi destampada.");
    }
}
