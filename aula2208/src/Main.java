public class Main {
    public static void main(String[] args) {
        //criando autor
        Autor autor = new Autor();
        autor.nomeAutor = "J.R.R Tolkien";
        autor.emailAutor = "jrrtolkien@gmail.com";
        autor.CPFAutor = "123.456.789-00";
        //criando livro
        Livro livro = new Livro();
        livro.nome = "O Senhor dos Anéis.";
        livro.descricao = "Uma história de fantasia medieval.";
        livro.valor = 200.0;
        livro.isbn = "123-456-78-9";
        //puxando o autor pro livro
        livro.autor = autor;
        //printa as informacoes do livro 1
        System.out.println("Livro 1: ");
        livro.mostrarDetalhes();


        //criando outro autor
        Autor outroAutor = new Autor();
        outroAutor.nomeAutor = "Antoine de Saint-Exupéry";
        outroAutor.emailAutor = "slkmuitodificil@gmail.com";
        outroAutor.CPFAutor = "123.456.789-22";

        //criando outro livro
        Livro outroLivro = new Livro();
        outroLivro.nome = "O Pequeno Príncipe.";
        outroLivro.descricao = "Uma história de criatividade infantil.";
        outroLivro.valor = 120.0;
        outroLivro.isbn = "123-456-56-9";
        //puxando o autor pro livro 2
        outroLivro.autor = outroAutor;

        //mostra as informacoes do livro 2
        System.out.println("Livro 2: ");
        outroLivro.mostrarDetalhes();

    }
}