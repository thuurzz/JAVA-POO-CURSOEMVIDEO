package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(){ // Metodo construtor
        this.tampar();
        this.setCor("Azul");
    }

    public Caneta(String m, String c, Float p){
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTampada() {
        return tampada;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + isTampada());

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
