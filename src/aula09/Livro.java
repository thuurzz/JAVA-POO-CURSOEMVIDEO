package aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    // Metodos especiais
    public String detalhes() {
        return "Livro:" +
                "\ntitulo='" + titulo + '\'' + "\tautor='" + autor + '\'' +
                "\ntotPaginas=" + totPaginas + "\tpagAtual=" + pagAtual + "\taberto=" + aberto +
                "\nleitor=" + leitor.getNome() + "\tleitor=" + leitor.getIdade()+ "\tleitor=" + leitor.getSexo();
    }


    // Construtor, getters e setters
    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p <= this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + p);
        } else {
            System.out.println("O livro contém " + getTotPaginas() + "páginas.");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
