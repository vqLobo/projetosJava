public class Atleta extends Pessoa{
    //Atributos ----------------------------------------------------------------------------
    private String esportePraticado;

    //Métodos -----------------------------------------------------------------------------
    @Override
    public double CalcularIMC(){
        double IMC = getPeso() / ( getAltura() * getAltura() );
        IMC = IMC * 0.95;
        return IMC;
    }
    @Override
    void MostrarDetalhes(){
        System.out.println("Nome da Pessoa atleta: " + getNome());
        System.out.println("Peso da Pessoa atleta: " + getPeso());
        System.out.println("Altura da Pessoa atleta: " + getAltura());
        System.out.println("IMC da pessoa atleta: " + CalcularIMC());
        System.out.println("Esporte Praticado: " + esportePraticado);
        System.out.println("----------");
    }

    //Get e Set
    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
