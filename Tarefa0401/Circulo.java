public class Circulo {
    public double raio;

    public double calcularArea(){
        return raio * (3.14 * 3.14);
    }

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}
