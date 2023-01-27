package servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import modelo.Carrera;
import modelo.Universidad;

public class UniversidadServiceImpl implements UniversidadService{
    private ArrayList<Universidad> lstUniversidad = new ArrayList<>();
    
    @Override
    public void anadirUniversidad(Universidad u){
        lstUniversidad.add(u);
    }

    @Override
    public void borrarUniversidad(int i) {
        lstUniversidad.remove(i);
    }

    @Override
    public ArrayList<Universidad> getLista() {
        return lstUniversidad;
    }

    @Override
    public void modificarUniversidad(int i, Universidad u) {
        lstUniversidad.set(i,u);
    }

    public void setLstUniversidad(ArrayList<Universidad> lstUniversidad) {
        this.lstUniversidad = lstUniversidad;
    }

    @Override
    public void almacenarArchivo(ArrayList<Universidad> lstUniversidad, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, false));
            for (Universidad universidad : lstUniversidad) {
                salida.writeUTF(universidad.getNomb());
                salida.writeUTF(universidad.getCuidad());
                salida.writeUTF(universidad.getTlf());
                salida.writeUTF(universidad.getDir());
                salida.writeUTF(universidad.getTipo());
            }
            

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(AsignaturaServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Universidad> recuperarArchivo(String ruta) {
        var uniList = new ArrayList<Universidad>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var nombre = entrada.readUTF();
                var ciudad = entrada.readUTF();
                var tlf = entrada.readUTF();
                var dir = entrada.readUTF();
                var tipo = entrada.readUTF();
                var universidad = new Universidad(nombre, ciudad, tlf, dir, tipo);
                uniList.add(universidad);
            }
        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                //java.util.logging.Logger.getLogger(UniversidadServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
        return uniList;
    }
    
}
