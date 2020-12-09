/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author daba5
 */
public class LlavePos {
    
    private String llave;
    private long RRN;

    public LlavePos(String llave, long pos) {
        this.llave = llave;
        this.RRN = pos;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public long getRRN() {
        return RRN;
    }

    public void setRRN(long RRN) {
        this.RRN = RRN;
    }

    @Override
    public String toString() {
        return "Nodo{" + "llave=" + llave + ", pos=" + RRN + '}';
    }
    
}
