class Main{
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumero(1123);
        c1.setSaldo(1500.00);
        c1.setLimite(1000.00);

        Conta c2 = new Conta();
        c2.setNumero(3213);
        c2.setSaldo(450.20);
        c2.setLimite(1500.00);

        c1.sacar(500.00);
        System.out.println(c1.getSaldo());

        c1.depositar(1000.00);
        System.out.println(c1.getSaldo());

        c1.transferir(2500.00, c2);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        c2.depositar(300.00);
        System.out.println(c2.getSaldo());

        c2.transferir(3250.2, c1);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
