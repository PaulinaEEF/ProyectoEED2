package proyecto;


public class Campo {
    
    //ATRIBUTOS
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean Lprimaria;
    private boolean LPotprimaria;

    public Campo(String nombre, String tipo, int longitud, boolean Lprimaria, boolean LPotprimaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.Lprimaria = Lprimaria;
        this.LPotprimaria = LPotprimaria;
    }

    public boolean isLPotprimaria() {
        return LPotprimaria;
    }

    public void setLPotprimaria(boolean LPotprimaria) {
        this.LPotprimaria = LPotprimaria;
    }
    
    //CONSTRUCTOR
    public Campo() {
        
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isLprimaria() {
        return Lprimaria;
    }

    public void setLprimaria(boolean Lprimaria) {
        this.Lprimaria = Lprimaria;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
