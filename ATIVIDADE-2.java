package Objetos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque = 0;

    public Produto() {

    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void getInfoProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Estoque: " + quantidadeEstoque);
    }
}

//------------------------------------------------------------------------------------------

package Main;

import Objetos.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.setNome("Prego");
        produto1.setPreco(22.85);
        produto1.setQuantidadeEstoque(50);

        produto1.getInfoProduto();

        System.out.println("-----------------------------------------------------------------------------");

        Produto produto2 = new Produto();

        produto2.setNome("Tabua 20x2,5x3,00MT PINUS A");
        produto2.setPreco(21.50);
        produto2.setQuantidadeEstoque(458);

        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Estoque: " + produto2.getQuantidadeEstoque());
    }
}
