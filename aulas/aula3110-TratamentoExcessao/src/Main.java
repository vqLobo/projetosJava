public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        try{
            calculadora.dividir(10, 0);
        } catch (DividirPorZeroException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
