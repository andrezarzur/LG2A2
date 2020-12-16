public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.raio = 5;

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());

        Circulo c2 = new Circulo();
        c2.raio = 22;

        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularPerimetro());

        Quadrado q1 = new Quadrado();
        q1.lado = 6;
        Quadrado q2 = new Quadrado();
        q2.lado = 7;

        if (q1.podeConter(q2)){
            System.out.println("O quadrado de lado " + q1.lado + " pode conter o quadrado de lado " + q2.lado + ";");
        }else{
            System.out.println("O quadrado de lado " + q1.lado + " não pode conter o quadrado de lado " + q2.lado + ";");
        }

        Retangulo r1 = new Retangulo();
        r1.altura = 10;
        r1.base = 15;
        Retangulo r2 = new Retangulo();
        r2.altura = 10;
        r2.base = 3;

        if (r1.podeConter(r2)){
            System.out.println("O retangulo de base " + r1.base + " e altura " + r1.altura + " pode conter o retangulo de base " + r2.base + " e altura " + r2.altura +";");
        }else{
            System.out.println("O retangulo de base " + r1.base + " e altura " + r1.altura + " não pode conter o retangulo de base " + r2.base + " e altura " + r2.altura +";");
        }


    }
}
