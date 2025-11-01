public class Calculadora{

    public void dividir(int a, int b) throws DividirPorZeroException {
        if (b == 0){
            throw new DividirPorZeroException("Não é possível dividir por zero bobo");
        }
        int c = a / b;
    }
}
