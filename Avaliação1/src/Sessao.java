import java.util.List;
import java.util.ArrayList;

public class Sessao implements SessaoInterface{
    private List<Ingresso> ingressos;

    public Sessao(){
        this.ingressos = new ArrayList<>();
    }

    @Override
    public void adicionar(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }

    @Override
    public int qtIngressos() {
        return ingressos.size();
    }

    @Override
    public int qtMeiaEntradas() {
        int count = 0;
        for (Ingresso ingresso: ingressos){
            if (ingresso.getMeia()){
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public double totalFaturado() {
        double total = 0;
        for (Ingresso ingresso: ingressos){
            total = total + ingresso.getValor();
        }
        return total;
    }
}
