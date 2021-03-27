package aula03;

public class aula03 {
    public static void main(String[] args) {
        // Instanciar objeto a partir da classe
        Caneta c1 = new Caneta();

        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.status();

        c1.carga = 80;
        c1.tampar();
        c1.status();
    }
}
