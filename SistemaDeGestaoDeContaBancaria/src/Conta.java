public abstract class Conta implements OperacoesBancarias {

    //atributos da conta

    private int numero;
    private String titular;
    private double saldo;

    //métodos públicos
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    //metodo abstrato
    public abstract void atualizarSaldo() throws SaldoInsuficienteException;

    @Override
    public abstract void transferir(Conta destino, double saldo) throws SaldoInsuficienteException;

    @Override
    public abstract void imprimirExtrato();
}
