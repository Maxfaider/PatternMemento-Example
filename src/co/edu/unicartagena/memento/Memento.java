
package co.edu.unicartagena.memento;

/**
 *
 * @author Alan M.E
 * @see 13/04/2017
 */

public class Memento {
    private String[] participante1;
    private String[] participante2;

    public Memento(String[] participante1, String[] participante2) {
        this.participante1 = new String[2];
        this.participante1[0] = participante1[0];
        this.participante1[1] = participante1[1];
        
        this.participante2 = new String[2];
        this.participante2[0] = participante2[0];
        this.participante2[1] = participante2[1];
    }

    public String[] getParticipante1() {
        return participante1;
    }

    public void setParticipante1(String[] participante1) {
        this.participante1 = participante1;
    }

    public String[] getParticipante2() {
        return participante2;
    }

    public void setParticipante2(String[] participante2) {
        this.participante2 = participante2;
    }
    
}
