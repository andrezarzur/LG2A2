public class Quadrado {
    private double lado;

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double getLado(){
        return lado;
    }

    private void setLado(double lado){
        if(lado <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior do que zero.");
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }

    public boolean podeConter(Quadrado q){
        return this.lado >= q.lado;
    }
}
