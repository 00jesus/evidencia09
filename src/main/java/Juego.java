import java.util.ArrayList;

public class Juego {
    private int sumatoriaDados;
    public ArrayList<Dado> listaDados;

    public Juego(int sumatoriaDados, ArrayList<Dado> listaDados) {
        this.sumatoriaDados = sumatoriaDados;
        this.listaDados = listaDados;
    }

    public Juego() {
    }
    public void agregarDado(Dado dado) {
        listaDados.add(dado);
    }
    public void lanzarDados() {
        for (Dado dado: listaDados) {
            dado.generarNumeroAleatorio();
        }
    }

    public void sumarDados(Dado dado1, Dado dado2) {
        int num1 = dado1.getNumero();
        int num2 = dado2.getNumero();
        Calculadora calc = new Calculadora(num1, num2);
        this.sumatoriaDados = calc.sumar();
    }
    public boolean condicion () {
        if (getSumatoriaDados()==10) {
            System.out.println("Gano");
            return true;
        }else {
            System.out.println("siga participando");
            return false;
        }
    }

    public int getSumatoriaDados() {
        return sumatoriaDados;
    }

    public ArrayList<Dado> getListaDados() {
        return listaDados;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "sumatoriaDados=" + sumatoriaDados +
                ", listaDados=" + listaDados +
                '}';
    }
}