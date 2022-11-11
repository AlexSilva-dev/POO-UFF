package Classes_Figuras;

public class Circulo extends Figura {

    private double raio;

    // métodos
    public Circulo() {
    }

    ;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;

    }

    public double area(){

        double area = Math.PI * raio * raio;
        return area;
    }



    @Override
    public String toString() {

        String inf = "raio= " + raio + " área+ " + area() + " ";
        return inf + super.toString();
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}