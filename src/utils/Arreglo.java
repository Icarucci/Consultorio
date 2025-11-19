package utils;

import Objetos.Persona;
import Objetos.Puesto;
import Objetos.Turno;

/*CLASE UTILITARIA PARA GESTIONAR LOS ARREGLOS.*/
public class Arreglo {
    /*INSERCIONES*/
    /**
     * METODO QUE RECIBE UN ARREGLO DE PERSONAS Y LE AGREGA UNA PERSONA EN UNA NUEVA POSICION.
     * mediante polimorfismo, sirve para paciente y profesional
     * @param arreglo
     * @return arreglo de Persona con una posicion mas
     */
    public static Persona[] agregarPosicion(Persona[]arreglo,Persona persona){
        Persona [] nuevo = new Persona[arreglo.length+1];
        for(int i=0;i<arreglo.length;i++){
            nuevo[i]=arreglo[i];
        }
        nuevo[nuevo.length-1] = persona;
        return nuevo;
    }
    /**
     * METODO QUE RECIBE UN ARREGLO DE TURNOS Y LE AGREGA UN TURNO EN UNA NUEVA POSICION.
     * @param arreglo
     * @return arreglo de Turno con una posicion mas
     */
    public static Turno[] agregarPosicion(Turno[]arreglo, Turno turno){
        Turno [] nuevo = new Turno[arreglo.length+1];
        for(int i=0;i<arreglo.length;i++){
            nuevo[i]=arreglo[i];
        }
        nuevo[nuevo.length-1] = turno;
        return nuevo;
    }
     /**
     * METODO QUE RECIBE UN ARREGLO DE PUESTOS Y LE AGREGA UN PUESTO EN UNA NUEVA POSICION.
     * @param arreglo
     * @return arreglo de Puesto con una posicion mas
     */
    public static Puesto[] agregarPosicion(Puesto[]arreglo,Puesto puesto){
        Puesto [] nuevo = new Puesto[arreglo.length+1];
        for(int i=0;i<arreglo.length;i++){
            nuevo[i]=arreglo[i];
        }
        nuevo[nuevo.length-1]=puesto;
        return nuevo;
    }
     /**
     * METODO QUE RECIBE UN ARREGLO DE STRING Y LE AGREGA UNA STRING EN UNA NUEVA POSICION.
     * @param arreglo
     * @return arreglo de Turno con una posicion mas
     */
    public static String[] agregarPosicion(String[]arreglo,String cadena){
        String [] nuevo = new String[arreglo.length+1];
        for(int i=0;i<arreglo.length;i++){
            nuevo[i]=arreglo[i];
        }
        nuevo [nuevo.length-1]=cadena;
        return nuevo;
    }
    /*ORDENAMIENTOS*/
    public static Persona[] ordenaPersonas(Persona[]arreglo){
        for(int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo.length-1;j++){
                if((arreglo[j].getNombre().compareTo(arreglo[j+1].getNombre()))>0){
                    Persona aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        return arreglo;
    }
    
}
