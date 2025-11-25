package Controller;

import objetos.Institucion;
import objetos.Paciente;
import utils.IO;

public class PacienteController {
    
    public static Paciente nuevoPaciente(Institucion institucion){
        String nombre = IO.inputString("Paciente", "Ingrese nombre");
        String apellido = IO.inputString("Paciente", "Ingrese apellido");
        String id = IO.inputString("Paciente", "Ingrese ID");
        String direccion = IO.inputString("Paciente", "Ingrese direccion");
        String obraSocial = IO.inputString("Paciente", "Ingrese Obra Social");
        int sesionesTotales = IO.inputIntegerPositive("Paciente", "Ingrese cantidad de sesiones");
        boolean cronico = IO.inputBoolean("Paciente", "Es cronico (true/false)");
        Paciente paciente = new Paciente(nombre,apellido,id,direccion,obraSocial,sesionesTotales,cronico);
        /**Falta agregado del paciente a la institucion cuando este lista la clase Institucion */
        return paciente;
    }
}
