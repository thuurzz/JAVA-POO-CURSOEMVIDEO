package aula06;

public class ControleRemoto implements Controlador{
    // Atributos
    Integer volume;
    Boolean ligado;
    Boolean tocando;

    //Construtor sem parametros
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer volume) {
        this.volume = volume;
    }

    private Boolean getLigado() {
        return ligado;
    }

    private void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    private Boolean getTocando() {
        return tocando;
    }

    private void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()) {
            System.out.println("=====MENU====");
            System.out.println("Está ligado: " + this.getLigado());
            System.out.println("Esta tocando: " + this.getTocando());
            System.out.print("Volume atual: " + this.getVolume() + "% ");
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("ERRO! Aparelho desligado!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 10);
        }else {
            System.out.println("ERRO! Aparelho desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -10);
        }else {
            System.out.println("ERRO! Aparelho desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }else {
            System.out.println("ERRO! Aparelho desligado!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else {
            System.out.println("ERRO! Aparelho desligado!");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && (!this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("ERRO! Aparelho desligado!");
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("ERRO! Aparelho desligado!");
        }
    }
}
