/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import paquete4.Palabra;
/*con "import paquete4.*" se importa todo lo que
contenga el paquete*/

/**
 *
 * @author reroes
 */
public class Mensaje {

    public static String obtenerFrase() {
        return String.format("%s, una ciudad llena de arte y naturaleza", 
                Palabra.obtenerPalabra());
    }
}
