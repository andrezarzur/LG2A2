public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    public Retangulo(double lado){
        this.setAltura(lado);
        this.setBase(lado);
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    private void setBase(double base){
        if(base <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior do que zero.");
        this.base = base;
    }

    private void setAltura(double altura){
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
