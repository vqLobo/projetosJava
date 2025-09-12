public class CarrinhoCompra {

    private double valorTotal;

    public void adicionarLivro(Livro livro){
        System.out.println("Livro adicionado ao carrinho: " + livro);
        valorTotal += livro.getValor();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
