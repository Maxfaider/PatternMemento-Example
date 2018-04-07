
package co.edu.unicartagena.memento;

import java.util.Stack;

/**
 *
 * @author Alan M.E
 * @see 13/04/2017
 */

public class Caretaker {
    
    private Stack<Memento> pila;
    
    public Caretaker() {
        this.pila = new Stack<Memento>();
    }
    
    public void RestoreState(Marcador marcador) {
        if(!this.pila.empty()) {
            marcador.restore(this.pila.pop());
        }
    }
    
    public void saveSate(Memento memento) {
        this.pila.push(memento);
    }
    
}
