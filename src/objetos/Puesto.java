package objetos;

public class Puesto {
     /*Atributo*/
    private String nombre;
    private boolean ocupado;
    /*Constructor*/
    public Puesto(String nombre) {
        this.nombre = nombre;
        this.ocupado = false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
