public class CarroEletrico implements Autonomo, Recarregavel{
    private String modelo;
    private String destino;
    private int tempoMinutos;

    public CarroEletrico(String modelo, String destino, int tempoMinutos){
        this.modelo = modelo;
        this.destino = destino;
        this.tempoMinutos = tempoMinutos;
    }

    @Override
    public void dirigirAutonomo() {
        System.out.println("O modelo " + modelo + " dirigindo autonomamente para o destino: " + destino + ", com o suporte de GPS: " + SUPORTE_GPS);
    }

    @Override
    public void recarregavel() {
        System.out.println("O modelo " + modelo + " está recarregando por " + tempoMinutos + " minutos.");
    }
}
