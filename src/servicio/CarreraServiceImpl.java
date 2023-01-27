/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Carrera;

public class CarreraServiceImpl implements CarreraService{
    
    private ArrayList<Carrera> lstCarrera = new ArrayList<>();

    @Override
    public void anadirCarrera(Carrera c) {
        lstCarrera.add(c);
    }

    @Override
    public void borrarCarrera(int i) {
        lstCarrera.remove(i);
    }

    @Override
    public void modificarCarrera(int i, Carrera c) {
        lstCarrera.set(i, c);
    }

    @Override
    public ArrayList<Carrera> getLista() {
        return lstCarrera;
    }

    public void setLstCarrera(ArrayList<Carrera> lstCarrera) {
        this.lstCarrera = lstCarrera;
    }
    
    
    @Override
    public void almacenarArchivo(ArrayList<Carrera> lstCarrera, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, false));
            for (Carrera carrera : lstCarrera) {
                salida.writeUTF(carrera.getCod());
                salida.writeUTF(carrera.getNomb());
                salida.writeInt(carrera.getDuracion());
                salida.writeUTF(carrera.getModalidad());
                salida.writeUTF(carrera.getTitulo());
            }
        } catch (IOException ex) {
            Logger.getLogger(AsignaturaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Carrera> recuperarArchivo(String ruta) {
        var carrList = new ArrayList<Carrera>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readUTF();
                var nombre = entrada.readUTF();
                var duracion = entrada.readInt();
                var modalidad = entrada.readUTF();
                var titulo = entrada.readUTF();
                var carrera = new Carrera(codigo, nombre, duracion, modalidad, titulo);
                carrList.add(carrera);
            }
        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(AsignaturaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return carrList;
    }
    
    
    
}
