package aula05;

import java.util.Scanner;

public class BankAccount {
    // Atributos da conta
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    // Construtor da conta
    public BankAccount() {
        this.setSaldo(0.0);
        this.setStatus(false);
    }

    public BankAccount(Integer numConta, String tipo, String dono, Double saldo, Boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public void estadoAtual(){
        System.out.println("==========ESTADO ATUAL============");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo() + " R$.");
        System.out.println("Status: " + this.getStatus());
        System.out.println("===================================");
    }

    // Instância do Scanner
    Scanner input = new Scanner(System.in);

    // Getter e Setters
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void abrirConta(String tipo){
        setTipo(tipo.toLowerCase());
        // Verifica se conta pode ser aberta
        if (this.getStatus()) {
            System.out.println("Conta já foi aberta.");
        // Se conta: Corrente +50 no saldo | Conta poupança +150
        } else {
            if (this.tipo.equals("cc")) {
                this.setSaldo(saldo += 50);
            } else if(this.tipo.equals("cp")){
                this.setSaldo(saldo += 150);
            }
            // Muda Status da conta para aberta(True)
            this.setStatus(true);
            System.out.println("Conta aberta com sucesso.");
        }

    }

    public void fecharConta(){
        // Para fechar conta, não poderá ter dividas nem saldo
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        // Se houver saldo, deve ser sacado
        } else if (this.getSaldo() > 0){
            System.out.println("Ainda há saldo em conta, será realizado o saque do valor.");
            this.sacar(this.getSaldo());
        // Se houver divida, deverá ser realizado um depósito para quitá-la
        } else if (this.getSaldo() < 0){
            System.out.println("Há saldo negativo em conta, deverá ser realizado o depósito do valor.");
            this.depositar(Math.abs(this.getSaldo())); // Tornar positivo
        }
    }

    public void depositar(Double valor){
        if (this.getStatus()) {
            // Soma valor do depósito ao valor do saldo da conta
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Foram depositados na conta de %s o valor: %s", this.getDono(),valor + " R$.");
            System.out.println();
            System.out.printf("Saldo atual de: %s%n", this.getSaldo() + " R$.");
            System.out.println();
        }
    }

    public void sacar(Double valor){
        if (this.getStatus()) {
            if (valor > this.getSaldo()) {
                System.out.println("Valor de saque " + valor + " maior que o valor em conta " + this.getSaldo() + " R$.");
                System.out.println("O saque não pode ser realizado.");
            } else {
                this.setSaldo(this.getSaldo() - valor);
                System.out.printf("Foram retirados da conta de %s o valor de: %s", this.getDono(),valor + " R$.");
                System.out.println();
                System.out.printf("Saldo atual de: %s%n", this.getSaldo() + " R$.");
                System.out.println();
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void pagarMensal(){
        if (this.getStatus()) {
            // Cobra taxa mensal referente ao tipo de conta
            Double mensalCC = 12.0;
            Double mensalCP = 20.0;
            if (tipo.equals("cc")) {
                this.setSaldo(this.getSaldo() - mensalCC);
                System.out.printf("Foram retirados da conta %s referentes a taxa mensal de conta", mensalCC);
                System.out.printf("Saldo atual de: %s%n", this.getSaldo());
            } else if (tipo.equals("cp")) {
                this.setSaldo(this.getSaldo() - mensalCP);
                System.out.printf("Foram retirados da conta %s referentes a taxa mensal de conta", mensalCP);
                System.out.printf("Saldo atual de: %s%n", this.getSaldo());
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada. ");
        }
    }
}



