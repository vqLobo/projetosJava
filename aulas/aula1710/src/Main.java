public class Main{
    public static void main(String[] args){

        Passaro passaro = new Passaro("Papagaio");
        passaro.voar();

        System.out.println("<<<<<======================>>>>>");

        Voavel voador = passaro;
        voador.voar();

        System.out.println("<<<<<======================>>>>>");

        Pato pato = new Pato("Patolino");
        pato.voar();
        pato.nadar();
    }
}