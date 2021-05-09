package aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        Funcionario func = new Funcionario();

        pessoa.setNome("Pedro");
        aluno.setNome("Maria");
        prof.setNome("Claudio");
        func.setNome("Fabiana");

        aluno.setCurso("Informatica");
        prof.setSalario(2500.75f);
        func.setSetor("Estoque");

        System.out.println(pessoa);
        System.out.println(aluno);
        System.out.println(prof);
        System.out.println(func);
    }
}
