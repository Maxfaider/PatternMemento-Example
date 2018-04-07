
package co.edu.unicartagena;

import co.edu.unicartagena.memento.Caretaker;
import co.edu.unicartagena.memento.Marcador;

/**
 *
 * @author Alan M.E
 * @see 13/04/2017
 */
public class Principal {

    private static Marcador marcador;
    private static Caretaker caretaker = new Caretaker();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        marcador = new Marcador("Equipo A", "Equipo B");
        marcador.increase("Equipo A");
        marcador.increase("Equipo B");
        
        marcador.show();
        caretaker.saveSate(marcador.save());
        
        marcador.increase("Equipo A");
        marcador.show();
        
        caretaker.RestoreState(marcador);
        marcador.show(); 
    }
    
}
