public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor){
        this.autor = autor;
    }

    void mostrarDetalhes(){
        String mensagem = "Detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------");


        if(temAutor()){
            autor.mostrarDetalhesAutor();
        }

        System.out.println("-----------");
    }



    boolean temAutor(){
        return autor != null;
    }


    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 20){
            System.out.println("Desconto não pode ser maior que 20%");
            return false;
        }
        valor -= valor * porcentagem / 100;

        return true;
    }

    /*void setValor(double valor){
        this.valor += valor;
    }

    double getValor(){
        return valor;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
