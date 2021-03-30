package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();
        Caneta c2 = new Caneta();
        c2.status();
    }
}
