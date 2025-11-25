import objetos.Institucion;
import view.Visualizacion;

public class Principal {
    public static void main(String[] args) throws Exception {
        Institucion apnea = new Institucion("Apnea");
        Visualizacion view = new Visualizacion(apnea);

        view.menuPrincipal();
    }
}