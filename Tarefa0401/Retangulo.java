public class Retangulo {
    public double base;
    public double altura;

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public boolean podeConter(Retangulo q){
        return this.base >= q.base && this.altura >= q.altura;
    }

}
