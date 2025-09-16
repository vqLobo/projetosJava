public class Main {
    public static void main(String[] args) {
        //Instancia pessoa e atleta
        Pessoa p1 = new Pessoa();
        Atleta a1 = new Atleta();

        //Dá os atributos
        p1.setNome("Fulano");
        p1.setAltura(1.80);
        p1.setPeso(75);

        a1.setNome("Ciclano");
        a1.setAltura(1.95);
        a1.setPeso(88);
        a1.setEsportePraticado("Futebol");

        //aplicando os métodos
        a1.CalcularIMC();
        p1.CalcularIMC();

        //imprimindo no terminal
        p1.MostrarDetalhes();
        a1.MostrarDetalhes();
    }
}