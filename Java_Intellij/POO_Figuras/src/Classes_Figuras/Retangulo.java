package Classes_Figuras;

public class Retangulo extends Figura{
    // Atributos
    protected double ladoA;
    protected double ladoB;

    // Métodos
    public Retangulo(){}

    public Retangulo(String cor, double ladoA, double ladoB){
        super(cor);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double area(){
        return ladoA*ladoB;
    }

    @Override
    public String toString() {
        String inf = "ladoA= " + ladoA + " ladoB= " + ladoB + " ";
        return inf + super.toString();
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
}
