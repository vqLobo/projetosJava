public interface OperacoesBancarias {
    void transferir(Conta destino, double saldo) throws SaldoInsuficienteException;
    void imprimirExtrato();
}
