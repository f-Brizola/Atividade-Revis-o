package objetos;

public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private int ano;


    public Carro () {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void getInfoCarro() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

//--------------------------------------------------------------------------------------------

package Main;

import objetos.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setMarca("Fiat");
        carro1.setModelo("Uno");
        carro1.setCor("Prata");
        carro1.setAno(2014);

        carro1.getInfoCarro();

        System.out.println("---------------------------------------------------------------------------");

        Carro carro2 = new Carro();

        carro2.setMarca("Toyota");
        carro2.setModelo("Hilux");
        carro2.setCor("Branco");
        carro2.setAno(2023);

        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getAno());
    }
}  
