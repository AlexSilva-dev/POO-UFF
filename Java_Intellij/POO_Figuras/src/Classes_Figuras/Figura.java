package Classes_Figuras;

public abstract class Figura {
    private String cor;

    // métodos
    public Figura(){};
    public Figura(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String toString(){
        return "cor= " + this.cor;
    }
}
