package proyecto;

//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Archivo /*implements Serializable*/ {
    
    //boolean Primaria;
    ArrayList<Campo> ListaCampos = new ArrayList();
    ArrayList<String> registros = new ArrayList();
    
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
        for (Campo campo : ListaCampos) {
            if (campo.isLprimaria()) {
                return true;
            }
        }
        return false;
    }

    /*public void setPrimaria(boolean Primaria) {
        this.Primaria = Primaria;
    }*/
    
    
}


