package aula02;

public class aula02 {
    public static void main(String[] args) {
        // Instanciar objeto a partir da classe
        Caneta c1 = new Caneta();

        // Modificar os atributos
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 05.f;
        c1.tampada = false;

        // Chama o métodos que mostra status do objeto
        c1.status();
        // Chama método rabiscar
        c1.rabiscar();
        // Chame método tampar caneta
        c1.tampar();

        // Novo objeto
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.tampada = true;

        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
}
