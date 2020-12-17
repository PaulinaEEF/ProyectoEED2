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
public class ComboItem {
    
     private String campo;
    private int pos;

    public ComboItem(String c, int p)
    {
        this.campo = c;
        this.pos = p;
    }

    @Override
    public String toString()
    {
        return campo;
    }

    public String getCampo()
    {
        return campo;
    }

    public int getPos()
    {
        return pos;
    }
    
}
