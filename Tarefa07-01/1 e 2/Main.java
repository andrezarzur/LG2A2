public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());

        Circulo c2 = new Circulo(22.0);

        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularPerimetro());

        Quadrado q1 = new Quadrado(6.0);
        Quadrado q2 = new Quadrado(7.0);

        if (q1.podeConter(q2)){
            System.out.println("O quadrado de lado " + q1.getLado() + " pode conter o quadrado de lado " + q2.getLado() + ";");
        }else{
            System.out.println("O quadrado de lado " + q1.getLado() + " não pode conter o quadrado de lado " + q2.getLado() + ";");
        }

        Retangulo r1 = new Retangulo(10.0, 15.0);

        Retangulo r2 = new Retangulo(10.0, 7.0);

        if (r1.podeConter(r2)){
            System.out.println("O retangulo de base " + r1.getBase() + " e altura " + r1.getAltura() + " pode conter o retangulo de base " + r2.getBase() + " e altura " + r2.getAltura() +";");
        }else{
            System.out.println("O retangulo de base " + r1.getBase() + " e altura " + r1.getAltura() + " não pode conter o retangulo de base " + r2.getBase() + " e altura " + r2.getAltura() +";");
        }

        Retangulo r3 = new Retangulo(10.0);

        System.out.println(r3.calcularArea());
        System.out.println(r3.calcularPerimetro());

    }
}
