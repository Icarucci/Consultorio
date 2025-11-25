package objetos;

public class Paciente extends Persona{
    private String obraSocial;
    private int sesionesTotales;
    private String[] historiaClinica;
    private Turno[] sesiones;
    private boolean cronico;

    public Paciente(String nombre, String apellido, String id, String direccion,String obraSocial, int sesionesTotales,
            boolean cronico) {
        super(nombre, apellido, id,direccion);
        this.obraSocial = obraSocial;
        this.sesionesTotales = sesionesTotales;
        this.cronico = cronico;
        historiaClinica = new String[0];
        sesiones = new Turno[0];
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getSesionesTotales() {
        return sesionesTotales;
    }

    public void setSesionesTotales(int sesionesTotales) {
        this.sesionesTotales = sesionesTotales;
    }

    public boolean isCronico() {
        return cronico;
    }

    public void setCronico(boolean cronico) {
        this.cronico = cronico;
    }
    
}
