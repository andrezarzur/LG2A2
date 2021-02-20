public class Papel {
    private String nome;
    private boolean protagonista;
    private Ator ator;
    private Filme filme;

    public Papel(String nome, boolean protagonista, Ator ator, Filme filme) {
        this.nome = nome;
        this.protagonista = protagonista;
        this.ator = ator;
        this.filme = filme;
    }

    public String getNome() {
        return nome;
    }

    public Ator getAtor(){
        return ator;
    }

    public Filme getFilme(){
        return filme;
    }

    public boolean getProtag(){
        return protagonista;
    }

    public String toString() {
        return nome + ", " + protagonista + ", " + ator.getNome() + ", " + filme.getTitulo();
    }


}