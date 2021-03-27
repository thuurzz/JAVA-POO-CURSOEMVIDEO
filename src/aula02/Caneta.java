package aula02;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tamapda? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada){
            System.out.println("Caneta " + this.modelo + " tampada, não pode rabiscar...");
        } else {
            System.out.println( this.modelo + " está rabiscando...");
        }

    }

    void tampar(){
        this.tampada = true;
        System.out.println("Caneta " + this.modelo + " foi tampada.");
    }

    void destampar(){
        this.tampada = false;
        System.out.println("Caneta " + this.modelo + " foi destampada.");
    }
}
