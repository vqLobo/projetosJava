public class Ebook extends Livro {
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 15){
            System.out.println("O desconto não pode ser maior que 15%");
            return false;
        }
        return super.aplicarDescontoDe(porcentagem);
    }

    @Override
    void mostrarDetalhes(){
        String mensagem = "Detalhes do livro Ebook: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Watermark: " + waterMark);
        System.out.println("------------");


        if(temAutor()){
            getAutor().mostrarDetalhesAutor();
        }

        System.out.println("-----------");
    }









    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
