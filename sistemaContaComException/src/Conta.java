public class Conta {
    public double saldoDaConta = 1000;
    public double valorDoSaque;

    public void sacar(double valorDoSaque) throws ValorInsuficienteException{
        if (valorDoSaque > saldoDaConta){
            throw new ValorInsuficienteException("Erro de não ter saldo o suficiente para ser sacado.");
        } else {
            saldoDaConta = saldoDaConta - valorDoSaque;
        }
    }

}
