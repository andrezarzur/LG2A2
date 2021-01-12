public class Circulo {
    private double raio;

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if(raio <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior do que zero.");
        this.raio = raio;
    }

    public double calcularArea(){
        return raio * (3.14 * 3.14);
    }

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}
