public class Pessoa {
    //Atributos ----------------------------------------------------------------------------
    private String nome;
    private double peso;
    private double altura;

    //Métodos ------------------------------------------------------------------------------
    public double CalcularIMC(){
        double IMC = peso/(altura*altura);
        return IMC;
    }
    void MostrarDetalhes(){
        System.out.println("Nome da Pessoa: " + nome);
        System.out.println("Peso da Pessoa: " + peso);
        System.out.println("Altura da Pessoa: " + altura);
        System.out.println("IMC da pessoa: " + CalcularIMC());
        System.out.println("----------");
    }

    //Getter e Setters ---------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
