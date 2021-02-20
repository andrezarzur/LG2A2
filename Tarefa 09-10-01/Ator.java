import java.util.List;
import java.util.ArrayList;

public class Ator {
    private String nome;
    private List<Papel> papeis;

    public Ator(String nome) {
        this.nome = nome;
        this.papeis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addPapel(Papel papel) {
        this.papeis.add(papel);
    }

    public List<Filme> getFilmes() {
        ArrayList<Filme> filmes1 = new ArrayList<>();
        for (Papel papel : papeis) {
            filmes1.add(papel.getFilme());
        }
        return filmes1;
    }

    public boolean atuouNoAno(int ano) {
        for (Papel papel : papeis) {
            if (papel.getFilme().getAno() == ano){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return nome + ", " + papeis;
    }

}