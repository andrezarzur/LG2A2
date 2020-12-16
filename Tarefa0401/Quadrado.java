public class Quadrado {
    public double lado;


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
