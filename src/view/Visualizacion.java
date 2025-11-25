package view;

import Controller.PacienteController;
import objetos.Institucion;
import utils.IO;

public class Visualizacion {  
    private Institucion inst;
    private int opcionMenuPrincipal;
    private int opcionMenuPacientes;

    public Visualizacion(Institucion inst){
        this.inst = inst;
    }
   
    public void menuPrincipal(){
        boolean finalizar = false;
        do {
             opcionMenuPrincipal = IO.opcionSelect("Bienvenido a "+inst.getNombre(), "1.Pacientes\n2.Profesionales\n3.Turnos\n0.Salir", 3);
            switch (opcionMenuPrincipal) {
                case 1:
                    opcionMenuPacientes();
                    break;
                case 2:
                    opcionMenuProfesionales();
                    break;
                case 3:
                    opcionMenuTurnos();
                    break;
                case 0:
                    finalizar = true;
                    break;
                default:
                    break;
            }
        } while (!finalizar);
    }

    public void opcionMenuPacientes(){
        boolean atras = false;
        do {
            opcionMenuPacientes = IO.opcionSelect("Pacientes", "1.Nuevo paciente\n0. Atras", 5);
            switch (opcionMenuPacientes) {
                case 0:
                    atras = true;
                    break;
                case 1:
                    PacienteController.nuevoPaciente(inst);
                    break;
                default:
                    break;
            }
        } while (!atras);
    }

    public void opcionMenuProfesionales(){
        boolean atras = false;
        do {
            opcionMenuPacientes = IO.opcionSelect("Profesionales", "0. Atras", 5);
            switch (opcionMenuPacientes) {
                case 0:
                    atras = true;
                    break;
                default:
                    break;
            }
        } while (!atras);
    }

    public void opcionMenuTurnos(){
        boolean atras = false;
        do {
            opcionMenuPacientes = IO.opcionSelect("Turnos", "0. Atras", 5);
            switch (opcionMenuPacientes) {
                case 0:
                    atras = true;
                    break;
                default:
                    break;
            }
        } while (!atras);
    }
   
}
