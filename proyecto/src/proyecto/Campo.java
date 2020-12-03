package proyecto;


public class Campo {
    
    //ATRIBUTOS
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean Lprimaria;
    
    //CONSTRUCTOR
    public Campo() {
        
    }

    public Campo(String nombre, String tipo, int bytes, boolean Lprimaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = bytes;
        this.Lprimaria = Lprimaria;
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
