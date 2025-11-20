package objetos;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Turno {
    /*ATRIBUTOS*/
    public final int PUESTOS_TOTALES = 5;
    private Puesto puestoAsignado;
    private Paciente[] pacientes;
    private Profesional[] profesionales;
    private LocalDate fecha;
    private Horario horario;
    /*CONSTRUCTORES*/
    public Turno(Puesto puestoAsignado, LocalDate fecha, Horario horario) {
        this.puestoAsignado = puestoAsignado;
        this.fecha = fecha;
        this.horario = horario;
        this.pacientes = new Paciente[PUESTOS_TOTALES];
        this.profesionales = new Profesional[PUESTOS_TOTALES];
    }
    /*GETTERS & SETTERS*/
    public Puesto getPuestoAsignado() {
        return puestoAsignado;
    }
    public void setPuestoAsignado(Puesto puestoAsignado) {
        this.puestoAsignado = puestoAsignado;
    }
    public Paciente getPaciente(int index) {
        return pacientes[index];
    }
   
    public Profesional getProfesional(int index) {
        return profesionales[index];
    }
   
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Horario getHorario() {
        return horario;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    /*Metodos*/
    /**
     * METODO QUE ASIGNA UN PACIENTE Y UN PROFESIONAL A UN TURNO ESPECIFICO
     * @param pp
     * @param prof
     */
    public void addPaciente(Paciente pp, Profesional prof){
        if(!isFull()){
            for(int i = 0;i<pacientes.length;i++){
                if(pacientes[i] == null){
                    pacientes[i] = pp;
                    profesionales[i] = prof;
                }
            }
            JOptionPane.showMessageDialog(null, "Paciente agregado al turno!","Exito!",1);
        }else{
            JOptionPane.showMessageDialog(null, "El turno esta completo","Turno Completo",0);
        }
    }
    /**
     * METODO PARA CHEQUEAR SI EL TURNO ESTA COMPLETO
     * @return boolean si el turno esta lleno o no.
     */
    public boolean isFull(){
        for(int i=0; i<pacientes.length;i++){
            if(pacientes[i]==null){
                return false;
            }
        }
        return true;
    }
}
