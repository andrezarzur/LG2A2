public class Ingresso {
    private boolean meia;
    private double valor;

    public Ingresso(boolean meia, double valor){
        this.meia = meia;
        this.valor = valor;
    }

    public boolean getMeia(){
        return meia;
    }

    public double getValor(){
        return valor;
    }
}
