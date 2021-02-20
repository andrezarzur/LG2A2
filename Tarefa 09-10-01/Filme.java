import java.util.List;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;

    public Filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.papeis = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void addPapel(Ator ator, String nome, boolean protagonista) {
        if (this.getProtagonista() != null && protagonista){
            System.out.println("Filme já tem protagonista.");
        } else {
            Papel papel = new Papel(nome, protagonista, ator, this);
            ator.addPapel(papel);
            this.papeis.add(papel);
        }
    }

    public List<Ator> getAtores() {
        ArrayList<Ator> atores1 = new ArrayList<>();
        for (Papel papel : papeis) {
            atores1.add(papel.getAtor());
        }
        return atores1;
    }

    public Ator getProtagonista() {
        for (Papel papel : papeis) {
            if (papel.getProtag()){
                return papel.getAtor();
            }
        }
        return null;
    }

    public int getAno(){
        return ano;
    }
    
    public String toString() {
        return titulo + ", " + ano + ", " + papeis;
    }

}