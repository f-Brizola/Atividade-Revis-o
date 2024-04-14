package Objetos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto () {

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

    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

    public void getInfoProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}


//----------------------------------------------------------------------------------------


package Main;

import Objetos.Produto;

import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        int op = 0;
        int x = 0;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("----------====== MENU ======----------");
            System.out.println("1 - Cadastrar Produto: ");
            System.out.println("2 - Alterar Produto: ");
            System.out.println("3 - Informação do Produto: ");
            System.out.println("5 - Sair: ");
            System.out.printf("Opção: ");
            op = scanner.nextInt();


            if (op == 1) {
                if (x ==0) {
                    x = x + 1;

                    System.out.printf("Nome: ");
                    scanner.nextLine();
                    produto1.setNome(scanner.nextLine());
                  
                    System.out.printf("Preço: ");
                    produto1.setPreco(scanner.nextDouble());
                  
                    System.out.printf("Quantidade: ");
                    produto1.setQuantidade(scanner.nextInt());
                }else {
                    System.out.println("Cadastro Completo");
                }
            }

            if (op == 2) {
                if (x !=0) {

                    System.out.println("Nome: "+ produto1.getNome());

                    System.out.println("Preço antigo: "+ produto1.getPreco());
                    System.out.printf("Preço Novo: ");
                    produto1.setPreco(scanner.nextDouble());

                    System.out.println("Quantidade antiga: "+ produto1.getQuantidade());
                    System.out.printf("Qunatidade Nova: ");
                    produto1.setQuantidade(scanner.nextInt());

                }
            }

            if (op == 3) {
                if (x !=0) {
                    produto1.getInfoProduto();
                }
            }
            
        }while (op !=5);
    }
}
