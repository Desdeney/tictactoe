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
    private String symbol;
    private String spielerName;
    private int SpielerNr;

    public Spieler(String symbol, String spielerName, int SpielerNr) {
        this.symbol = symbol;
        this.spielerName = spielerName;
        this.SpielerNr = SpielerNr;
    }

    
    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the SpielerNr
     */
    public int getSpielerNr() {
        return SpielerNr;
    }

    /**
     * @return the spielerName
     */
    public String getSpielerName() {
        return spielerName;
    }

    
}
