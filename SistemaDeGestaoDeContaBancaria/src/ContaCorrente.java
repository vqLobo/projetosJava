public class ContaCorrente extends Conta implements OperacoesBancarias{

    @Override
    public void atualizarSaldo() throws SaldoInsuficienteException {
        double saldoAtual = super.getSaldo();
        double taxaSaque = saldoAtual * 0.995;

        sacar(taxaSaque);
    }

    @Override
    public void transferir(Conta destino, double saldoTransferencia) throws SaldoInsuficienteException {
        double saldoConta = getSaldo();
        if(saldoConta < saldoTransferencia){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta Corrente");
        System.out.println("Saldo: " + super.getSaldo());
    }
}
