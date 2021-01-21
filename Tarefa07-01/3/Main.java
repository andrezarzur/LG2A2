class Main{
    public static void main(String[] args) {
        Conta c1 = new Conta(1123, 1500.00, 1000.00);

        Conta c2 = new Conta(3213, 450.20, 1500.00);

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

        Conta c3 =  new Conta(5123, 520.00);

        c3.depositar(200.00);
        System.out.println(c3.getSaldo());
        System.out.println(c3.getLimite());

        Conta c4 = new Conta(7521);

        c4.depositar(50.00);
        System.out.println(c4.getSaldo());
        System.out.println(c4.getLimite());
    }
}
