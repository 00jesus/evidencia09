public class Dado {
    private int numero;

    public Dado (){
    }
    public Dado(int numero) {
        this.numero = numero;
    }

    public int generarNumeroAleatorio() {
        this.numero = (int)(Math.random()*6+1);
        return numero;
    }

    public int getNumero() {
        return numero;
    }
}