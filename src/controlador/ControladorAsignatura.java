package controlador;

import java.util.ArrayList;
import modelo.Asignatura;
import servicio.AsignaturaServiceImpl;

public class ControladorAsignatura {

    private AsignaturaServiceImpl asigServImpl = new AsignaturaServiceImpl();

    private boolean validarNumeros(int cred, int numEst, int niv) {
        try {
            if (cred <= 0 || numEst <= 0) {

                return false;
            }
            return true;
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato"+ e1);
        }

    }

    private boolean validarInfo(String cod, String nom) {
        if (nom.length() == 0 || cod.length() == 0) {
            return false;
        }
        return true;
    }

    public boolean anadirAsignatura(String cod, String nom, int niv, int cred, int numEst) {
        try {
            if (validarNumeros(cred, numEst, niv) && validarInfo(cod, nom)) {
                asigServImpl.anadirAsignatura(new Asignatura(cod, nom, niv, cred, numEst));
                return true;
            } else {

                System.err.println("Datos mal ingresados");
                return false;
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato" + e1);
        }
    }

    public void borrarAsignatura(int i) {
        asigServImpl.borrarAsignatura(i);
    }

    public boolean modificarAsignatura(int i, String cod, String nom, int niv, int cred, int numEst) {
        try {
            if (validarNumeros(cred, numEst, niv) && validarInfo(cod, nom)) {
                asigServImpl.modificarAsignatura(i, new Asignatura(cod, nom, niv, cred, numEst));
                return true;
            } else {
                System.err.println("Datos mal ingresados");
                return false;
            }
        }catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato" + e1);
        }

    }

    public AsignaturaServiceImpl getAsigServImpl() {
        return asigServImpl;
    }
    
    
    
    public ArrayList<Asignatura> getLista() {
        return asigServImpl.getLista();
    }
    
    public void setLista(ArrayList<Asignatura>lstAsig) {
        asigServImpl.setLstAsig(lstAsig);
    }
}
