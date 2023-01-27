
package servicio;

import java.util.ArrayList;
import modelo.Carrera;

public interface CarreraService {
    public void anadirCarrera(Carrera c);
    public void borrarCarrera(int i);
    public void modificarCarrera(int i, Carrera c);
    public ArrayList<Carrera> getLista();
    public void almacenarArchivo(ArrayList<Carrera> carrera, String ruta);
    public ArrayList<Carrera> recuperarArchivo(String ruta);
}
