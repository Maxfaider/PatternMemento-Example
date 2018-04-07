
package co.edu.unicartagena.memento;

/**
 *
 * @author Alan M.E
 * @see 13/04/2017
 */

public class Marcador {
    private String[] participante1;
    private String[] participante2;
    
    public Marcador(String equipo1, String equipo2) {
        this.participante1 = new String[2];
        this.participante2 = new String[2];
        
        this.participante1[0] = equipo1;
        this.participante2[0] = equipo2;
        
        this.participante1[1] = "0";
        this.participante2[1] = "0";
    }
    
    public void increase(String equipo) {
        if(this.participante1[0].equals(equipo)) {
            incremento(participante1);
        } else {
            incremento(participante2);
        }
    }
    
    private void incremento(String[] participante) {
        int goal = Integer.parseInt(participante[1]);
        participante[1] = String.valueOf(goal+1);
    }
    
    public void restore(Object memento) {
       this.participante1 = ((Memento) memento).getParticipante1();
       this.participante2 = ((Memento) memento).getParticipante2();
    }
    
    public Memento save() {
        return new Memento(this.participante1, this.participante2);
    }
    
    public void show() {
        System.out.println("================Marcador==================");
        System.out.println(this.participante1[0]+": "+this.participante1[1]+"  "+
                this.participante2[0]+": "+this.participante2[1]);
        System.out.println("==========================================");
    }
    
}
