public class ContaPoupanca extends Conta implements OperacoesBancarias{

    @Override
    public void atualizarSaldo() {
        double saldoAtual = super.getSaldo();
        double rendimentoMensal = saldoAtual * 1.03;
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
        System.out.println("Extrato da conta poupanca");
        System.out.println("Saldo: " + super.getSaldo());
    }
}
