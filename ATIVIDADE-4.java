package Objeto;

public class Circulo {

    private double raio;
    private String cor;
    private double area;
    private double perimetro;

    
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }


    public void getInfoCirculo(){
        System.out.println("Raio: "+raio);
        System.out.println("Cor: "+cor);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+ perimetro);
    }
}


//------------------------------------------------------------------------------------------


package Main;

import Objeto.Circulo;

public class CirculoTeste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5,"Verde");

        c1.setRaio(1);

        c1.getInfoCirculo();

        Circulo c2 = new Circulo(558,"Branco");

        c2.setCor("Amarelo");
        System.out.println("Raio: " + c2.getRaio());
        System.out.println("Cor: " + c2.getCor());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimetro: " + c2.getPerimetro());


        Circulo c3 = new Circulo(487,"Verde");
        c3.setCor("Azul");
        System.out.println("Raio: " + c3.getRaio());
        System.out.println("Cor: " + c3.getCor());

    }
}
