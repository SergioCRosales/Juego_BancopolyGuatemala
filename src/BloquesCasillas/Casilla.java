/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloquesCasillas;

import Jugadores.PosicionFicha;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Casilla {
     private static final Map<Integer, PosicionFicha> Posiciones;
     
   
   

    static {
        Posiciones = new HashMap();
          int uno,one;
          uno = 1;
          one = +200;
          uno = one;
          
        Posiciones.put(12, new PosicionFicha(170, 310));
        Posiciones.put(11, new PosicionFicha(340, 310));
        Posiciones.put(10, new PosicionFicha(520, 360));
        Posiciones.put(9, new PosicionFicha(530, 240));
        Posiciones.put(8, new PosicionFicha(530, 120));
        Posiciones.put(7, new PosicionFicha(510, 0));
        Posiciones.put(6, new PosicionFicha(340, 10));
        Posiciones.put(5, new PosicionFicha(170, 10));
        Posiciones.put(4, new PosicionFicha(0, 0));
        Posiciones.put(3, new PosicionFicha(20, 110));
        Posiciones.put(2, new PosicionFicha(20, 240));
        Posiciones.put(1, new PosicionFicha(0, 360));
    
    }

   
    public static PosicionFicha nuevaPosicion(int casilla, int jugador) {
        PosicionFicha nuevaPosicion = new PosicionFicha(
                Casilla.Posiciones.get(casilla).getX(),
                Casilla.Posiciones.get(casilla).getY()
        );
        if (jugador == 1) {
            return nuevaPosicion;
        } else {
            nuevaPosicion.setY(nuevaPosicion.getY() + 40);
            return nuevaPosicion;
        }
    }
}
    

