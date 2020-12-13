package proyecto;

//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Archivo /*implements Serializable*/ {
    
    //boolean Primaria;
    private LinkedList AvailList = new LinkedList();
    private ArrayList<Campo> ListaCampos = new ArrayList();
    private ArrayList<String> registros = new ArrayList();
    
    private String nombre;

    public Archivo() {

    }

    public Archivo(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<String> registros) {
        this.registros = registros;
    }

    public ArrayList<Campo> getListaCampos() {
        return ListaCampos;
    }

    public void setListaCampos(ArrayList<Campo> ListaCampos) {
        this.ListaCampos = ListaCampos;
    }

    public Campo getListaCampo(int pos) {
        return ListaCampos.get(pos);
    }

    /*public void setListaCampo(Campo Campo) {
        this.ListaCampos.add(Campo);
    }*/

    public boolean hasPrimaria() {
        for (Campo campo : ListaCampos) {
            if (campo.isLprimaria()) {
                return true;
            }
        }
        return false;
    }
    
    
    public LinkedList getAvailList() {
        return AvailList;
    }
    
    public int getSizeMetadata() {
        String metadata = nombre;

        for (Campo campo : this.getListaCampos()) {
            metadata += "|"
                    + campo.getNombre()
                    + ":"
                    + campo.getTipo()
                    + ":"
                    + campo.getLongitud()
                    + ":";

            if (campo.isLprimaria()) {
                metadata += "true";
            } else {
                metadata += "false";
            }
            metadata += ":";
            if (campo.isLPotprimaria()) {
                metadata += "true";
            } else {
                metadata += "false";
            }
        }
        return metadata.length() + 1;//mas uno por \n(confirmado por fuentes confiables)          
    }

    /*public void setPrimaria(boolean Primaria) {
        this.Primaria = Primaria;
    }*/
    
    
}


