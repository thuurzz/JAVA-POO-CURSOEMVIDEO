package aula08;

import java.util.Objects;
import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rounds;
    private Boolean aprovada;

    // Métodos publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        // Verifica se os lutadores são da mesma categoria
        // Verifica se os lutadores escolhidos são diferentes um do outro
        // Caso tudo certo, torna luta válida
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void lutar(){
        if (this.getAprovada()){
            // Apresneta lutadores
            System.out.println("## DESAFIADO ##");
            this.desafiado.apresentar();
            System.out.println("## DESAFIANTE ##");
            this.desafiante.apresentar();

            // Chama a classe ramdom
            Random aleatorio = new Random();
            // Atribui um aleatório de 0 a 3 na var vendedor
            int vencedor = aleatorio.nextInt(3);
            System.out.println("==========RESULTADO DA LUTA============");
            switch (vencedor) {
                case 0 -> { // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> { // Desafiado vence
                    System.out.printf("O desafiado %s Venceu!", this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> { // Desafiante vence
                    System.out.printf("O desafiante %s Venceu!", this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }System.out.println();
        } else {
            System.out.println("Luta não pode ocorrer!");
        }
    }

    // Métodos especias
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
