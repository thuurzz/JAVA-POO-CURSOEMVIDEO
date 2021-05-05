package aula09;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Lucas", 19, 'M');
        p[1] = new Pessoa("Carolina", 19, 'F');

        l[0] = new Livro("Aprendendo Java", "Jose da Silva",300, p[0]);
        l[0] = new Livro("Aprendendo Python", "Guido da Silva", 500, p[0]);
        l[0] = new Livro("Aprendendo Bash", "Linus da Silva", 800, p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
