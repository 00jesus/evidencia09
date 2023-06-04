import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class juegoTest {
    @Test
    void testDadoNumAleatorio (){
        Dado dado = new Dado();
        int variable = dado.generarNumeroAleatorio();
        Assertions.assertTrue(variable >= 1);
        Assertions.assertTrue(variable <= 6);
    }

    @Test
    void lanzarDados (){
        ArrayList<Dado> listaDados = new ArrayList<>();
        Juego juego = new Juego(0, listaDados);
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        juego.agregarDado(dado1);
        juego.agregarDado(dado2);

        juego.lanzarDados();
        juego.sumarDados(dado1,dado2);

        int esperado = juego.getSumatoriaDados();

        Assertions.assertTrue(esperado >= 2 && esperado <= 12);
    }

    @Test
    void testCondicionVictoriaDerrota () {
        ArrayList<Dado> listaDados = new ArrayList<>();
        Juego juego = new Juego(0, listaDados);
        Dado dado1 = new Dado(4);
        Dado dado2 = new Dado(6);
        juego.agregarDado(dado1);
        juego.agregarDado(dado2);

        juego.sumarDados(dado1, dado2);
        boolean victoria = juego.condicion();
        Assertions.assertTrue(victoria);
    }
}
