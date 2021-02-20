class Main {
    public static void main(String[] args) {
        Ator a1 = new Ator("Ator 1");
        Ator a2 = new Ator("Ator 2");

        Filme f1 = new Filme("Filme 1", 2020);
        Filme f2 = new Filme("Filme 2", 2021);

        f1.addPapel(a1,"Papel 1", true);
        f1.addPapel(a2,"Papel 2", false);
        f2.addPapel(a1,"Papel 3", true);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.atuouNoAno(2020)); //true
        System.out.println(a1.atuouNoAno(2021)); //true
        System.out.println(a2.atuouNoAno(2021)); //false

        System.out.println(f1.getAtores());
        System.out.println(f2.getAtores());

        System.out.println(f1.getProtagonista());
        System.out.println(f2.getProtagonista());

        System.out.println(a1.getFilmes());
        System.out.println(a2.getFilmes());

        // Papel p1 = new Papel("Papel 1", true, a1, f1);
        // Papel p2 = new Papel("Papel 2", false, a2, f1);
        // Papel p3 = new Papel("Papel 3", true, a1, f  2);

        // a1.addPapel(p1);
        // a1.addPapel(p3);
        // a2.addPapel(p2);

        // f1.addPapel(p1);
        // f1.addPapel(p2);
        // f2.addPapel(p3);


    }
}