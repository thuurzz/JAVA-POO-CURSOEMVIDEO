package aula05;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        // Cria conta Arthur
        BankAccount p1 = new BankAccount();
        p1.setNumConta(1111);
        p1.setDono("Arthur");
        p1.abrirConta("cc");
        p1.estadoAtual();
        p1.depositar(100.0);

        // Cria conta Bea
        BankAccount p2 = new BankAccount();
        p2.setNumConta(2222);
        p2.setDono("Bea");
        p2.abrirConta("cp");
        p2.estadoAtual();
        p2.depositar(500.);
        p2.sacar(1000.0);

    }
}
