package Objetos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    public Produto (String nome) {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setInfProduto() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade do produto: " + quantidade);
    }
}


//-----------------------------------------------------------------------------------------

package Main;

import Objetos.Produto;

public class ProgramaProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Prego 17x27");
        produto1.setPreco(22.50);
        produto1.setQuantidade(80);
        produto1.setInfProduto();

        
        Produto produto2 = new Produto("Tabua 20X2,5X3,00MT",20.00);
        produto2.setQuantidade(472);
        produto2.setInfProduto();
        
        
        Produto produto3 = new Produto("Viga 15X15X3,00MT",550.00, 7);
        produto3.setInfProduto();
    }
}
