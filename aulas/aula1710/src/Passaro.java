public class Passaro implements Voavel {

    private String nome;

    public Passaro(String nome){
        this.nome = nome;
    }

    @Override
    public void voar(){
        System.out.println(nome + " está voando " + ALTITUDE_MAXIMA + " metros acima do solo.");
    }
}