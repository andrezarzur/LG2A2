public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(true, 10.00);
        Ingresso ingresso2 = new Ingresso(false, 20.00);
        Ingresso ingresso3 = new Ingresso(true, 10.00);
        Ingresso ingresso4 = new Ingresso(true, 10.00);

        Sessao sessao1 = new Sessao();
        sessao1.adicionar(ingresso1);
        sessao1.adicionar(ingresso2);
        System.out.println(sessao1.qtIngressos());
        System.out.println(sessao1.qtMeiaEntradas());
        System.out.println(sessao1.totalFaturado());

        Sessao sessao2 = new Sessao();
        sessao2.adicionar(ingresso3);
        sessao2.adicionar(ingresso4);
        System.out.println(sessao2.qtIngressos());
        System.out.println(sessao2.qtMeiaEntradas());
        System.out.println(sessao2.totalFaturado());
    }
}
