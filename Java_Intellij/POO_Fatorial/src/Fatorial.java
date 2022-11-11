public class Fatorial {
    // Atributo
    private int fatorial;

    // Métodos
    public Fatorial(){
        fatorial = 0;
    }

    public Fatorial(int fatorial){
        this.fatorial = fatorial;
    }
    public int CalculaFatorial(){
        int result = 1;

        if(fatorial == 0){
            return result;
        }
        for(int n=1; n<fatorial+1; n++){
            result = result*n;
        }
        return result;
    }

    public int getFatorial() {
        return fatorial;
    }

    public void setFatorial(int fatorial) {
        this.fatorial = fatorial;
    }
}
