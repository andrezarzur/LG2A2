public class Conta {
    private int numero;
    private double saldo;
    private double limite;

    public Conta(int numero, double saldo, double limite){
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

    public Conta(int numero, double saldo){
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public Conta(int numero){
        this.setNumero(numero);
    }

    public double getLimite(){
        return limite;
    }

    private void setLimite(double limite){
        validarValor(limite);
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    private void setSaldo(double saldo){
        validarValor(saldo);
        this.saldo = saldo;
    }

    public double getNumero(){
        return numero;
    }

    private void setNumero(int numero){
        validarValor(numero);
        this.numero = numero;
    }

    public void sacar(double valor){
        validarValor(valor);
        validarSaldo(valor);
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta conta){
        validarValor(valor);
        validarSaldo(valor);
        if(valor <= saldo + limite)
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
    }

    private void validarValor(double valor){
        if(valor <= 0.0)
            throw new IllegalArgumentException("O valor deve ser maior do que zero.");
    }

    private void validarSaldo(double valor){
        if(valor > limite + saldo)
            throw new IllegalArgumentException("O valor do saldo irá ultrapassar o limite da conta.");
    }
}
