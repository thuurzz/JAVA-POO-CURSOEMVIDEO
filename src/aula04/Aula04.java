package aula04;

public class Aula04 {
    public static void main(String[] args) {
        // Construtor com parametros
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();
        // Construtor padrão
        Caneta c2 = new Caneta();
        c2.status();
    }
}
