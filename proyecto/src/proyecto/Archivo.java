package proyecto;

//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Archivo /*implements Serializable*/ {
    
    //boolean Primaria;
    ArrayList<Campo> ListaCampos = new ArrayList();
    ArrayList<String> registros = new ArrayList();
    
    String nombre;
    
    public Archivo() {

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

    public void setListaCampo(Campo Campo) {
        this.ListaCampos.add(Campo);
    }

    public boolean hasPrimaria() {
        for (Campo campo : ListaCampos) {
            if (campo.isLprimaria()) {
                return true;
            }
        }
        return false;
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
        }
        
        return metadata.length();          
    }

    /*public void setPrimaria(boolean Primaria) {
        this.Primaria = Primaria;
    }*/
    
    
}


