public class Conta {
    private int numero;
    private double saldo;
    private double limite;

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        validarValor(limite);
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        validarValor(saldo);
        this.saldo = saldo;
    }

    public double getNumero(){
        return numero;
    }

    public void setNumero(int numero){
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
