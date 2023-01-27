
package servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Asignatura;

public class AsignaturaServiceImpl implements AsignaturaService{

    private ArrayList<Asignatura> lstAsig= new ArrayList<>();
    
    @Override
    public void anadirAsignatura(Asignatura a) {
        lstAsig.add(a);
    }

    @Override
    public void borrarAsignatura(int i) {
        lstAsig.remove(i);
    }

    @Override
    public void modificarAsignatura(int i, Asignatura a) {
        lstAsig.set(i, a);
    }

    @Override
    public ArrayList<Asignatura> getLista() {
        return lstAsig;
    }

    public void setLstAsig(ArrayList<Asignatura> lstAsig) {
        this.lstAsig = lstAsig;
    }
    
    
    @Override
    public void almacenarArchivo(ArrayList<Asignatura> lstAsig, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, false));
            for (Asignatura asignatura : lstAsig) {
                salida.writeUTF(asignatura.getCod());
                salida.writeUTF(asignatura.getNomb());
                salida.writeInt(asignatura.getNivel());
                salida.writeInt(asignatura.getCreditos());
                salida.writeInt(asignatura.getNumEst());
            }

        } catch (IOException ex) {
            Logger.getLogger(AsignaturaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Asignatura> recuperarArchivo(String ruta) {
        var asigList = new ArrayList<Asignatura>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readUTF();
                var nombre = entrada.readUTF();
                var nivel = entrada.readInt();
                var credito = entrada.readInt();
                var numEst = entrada.readInt();
                var asignatura = new Asignatura(codigo, nombre, nivel, credito, numEst);
                asigList.add(asignatura);
            }
        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                //Logger.getLogger(AsignaturaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return asigList;
    }
}
