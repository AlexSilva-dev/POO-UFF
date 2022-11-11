package Classes_Figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    // Métodos
    public Triangulo(){}

    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        double area = (base*altura)/2;
        return area;
    }

    @Override
    public String toString() {

        String inf = "base= " + base + " altura= " + altura + " " ;
        return inf + super.toString();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
