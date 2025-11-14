public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        //cria objetos de tipos de contas diferentes.
        Conta cC = new ContaCorrente();
        Conta cP = new ContaPoupanca();

        //depositando 1000 reais em cada conta
        cC.depositar(1000);
        cP.depositar(1000);

        //sacando 500 reais em cada conta
        cC.sacar(500);
        cP.sacar(500);

        //transferindo 100 reais para a conta poupança e 50 para a conta corrente
        cC.transferir(cP, 100);
        cP.transferir(cC, 50);

        //atualiza as contas
        cC.atualizarSaldo(); //tem a taxa de saque que é cobrada
        cP.atualizarSaldo(); //o dinheiro na poupança rende 3%


        //imprimi os saldos
        cC.imprimirExtrato();
        cP.imprimirExtrato();

    }
}