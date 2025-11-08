public class ContaPoupanca extends Conta implements OperacoesBancarias{

    @Override
    public void atualizarSaldo() {
        double saldoAtual = super.getSaldo();
        double rendimentoMensal = saldoAtual * 0.03;
        depositar(rendimentoMensal);
    }

    @Override
    public void transferir(Conta destino, double saldoTransferencia) throws SaldoInsuficienteException {
        double saldoConta = getSaldo();
        if(saldoConta < saldoTransferencia){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        sacar(saldoTransferencia);
        destino.depositar(saldoTransferencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta poupanca");
        System.out.println("Saldo: " + super.getSaldo());
    }
}
