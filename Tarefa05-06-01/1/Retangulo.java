public class Retangulo {
    private double base;
    private double altura;

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        if(base <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior do que zero.");
        this.base = base;
    }

    public void setAltura(double altura){
        if(altura <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior do que zero.");
        this.altura = altura;
    }

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
