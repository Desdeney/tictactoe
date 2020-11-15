 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sveno
 */
public class Spieler {
    private final String spielerName;
    private final int spielerNr;

    public Spieler(String spielerName, int SpielerNr) {
        this.spielerName = spielerName;
        this.spielerNr = SpielerNr;
    }

    /**
     * @return the SpielerNr
     */
    public int getSpielerNr() {
        return spielerNr;
    }

    /**
     * @return the spielerName
     */
    public String getSpielerName() {
        return spielerName;
    }

    
}
