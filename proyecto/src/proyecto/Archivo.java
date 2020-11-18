package proyecto;

//import java.io.Serializable;
import java.util.ArrayList;

public class Archivo /*implements Serializable*/ {
    
    boolean Primaria;
    ArrayList<Campo> ListaCampos = new ArrayList();

    public Archivo() {

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
        return Primaria;
    }

    public void setPrimaria(boolean Primaria) {
        this.Primaria = Primaria;
    }
    
    
}


