public class Main {
    public static void main(String[] args) {
        //aula4
        Autor autor3 = new Autor();
        autor3.setNomeAutor("Maranhão");
        autor3.setEmailAutor("maranhaogoat@gmail.com");
        autor3.setCPFAutor("995.334.678-91");

        Fisico livroFisico1 = new Fisico(autor3);
        livroFisico1.setNome("O segredo da vida");
        livroFisico1.setDescricao("A vida é cheia de segredos, aqui você começa a desvendá-la");
        livroFisico1.setValor(450);
        livroFisico1.setIsbn("111-222-333-444");

        livroFisico1.mostrarDetalhes();

        Ebook ebook1 = new Ebook(autor3);
        ebook1.setNome("O segredo da vida");
        ebook1.setDescricao("A vida é cheia de segredos, aqui você começa a desvendá-la");
        ebook1.setValor(450);
        ebook1.setIsbn("111-222-333-444");

        CarrinhoCompra carrinho = new CarrinhoCompra();
        carrinho.adicionarLivro(livroFisico1);
        carrinho.adicionarLivro(ebook1);
        //definindo o preço do carrinho de compra
        System.out.println("Valor total da compra: " + carrinho.getValorTotal());

//        //aula2
//
//        Autor autor1 = new Autor();
//        autor1.setNomeAutor("J.R.R Tolkien");
//        autor1.setEmailAutor("jrrtolkien@gmail.com");
//        autor1.setCPFAutor("123.456.789-00");
//
//        Autor autor2 = new Autor();
//        autor2.setNomeAutor("J.K Rowling");
//        autor2.setEmailAutor("jkrowling@gmail.com");
//        autor2.setCPFAutor("123.456.799-00");
//
//        //aula3
//
//        Ebook ebook1 = new Ebook(autor1);
//        ebook1.setNome("Herança em Java");
//        ebook1.setWaterMark("watermark");
//        ebook1.setDescricao("Teste de herança");
//        ebook1.setValor(50);
//        ebook1.setIsbn("468-487-963-1");
//
//        ebook1.mostrarDetalhes();
//        ebook1.aplicarDescontoDe(15);
//
//        System.out.println("Valor do Ebook: " + ebook1.getValor());
//
//
//        //aula2 de novo
//        Livro livro1 = new Livro(autor1);
//        livro1.setNome("O Senhor dos Anéis.");
//        livro1.setDescricao("Uma história de fantasia medieval.");
//        livro1.setValor(200);
//        livro1.setIsbn("123-456-78-9");
//
//        Livro livro2 = new Livro(autor2);
//        livro2.setNome("Harry Potter e a Pedra Filosofal");
//        livro2.setDescricao("Uma historia de magia e mistério");
//        livro2.setValor(300);
//        livro2.setIsbn("123-456-56-9");
//
//        livro1.setAutor(autor1);
//        livro2.setAutor(autor2);
//
//        livro1.mostrarDetalhes();
//        livro2.mostrarDetalhes();

//        livro1.aplicarDescontoDe(20);
//        livro2.aplicarDescontoDe(15);

//        System.out.println("O livro agora custa: " + livro1.getValor());
//        System.out.println("O livro agora custa: " + livro2.getValor());
//        System.out.println(livro1.temAutor());
//        System.out.println(livro2.temAutor());



        //aula1

        /*//criando autor
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
        outroLivro.mostrarDetalhes();*/

    }
}