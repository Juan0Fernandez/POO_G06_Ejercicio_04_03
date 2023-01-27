/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Carrera;

import servicio.CarreraServiceImpl;

public class ControladorCarrera {

     private CarreraServiceImpl carrServiceImpl = new CarreraServiceImpl();

    public CarreraServiceImpl getCarrServiceImpl() {
        return carrServiceImpl;
    }
    
    public CarreraServiceImpl getServicio(){
        return carrServiceImpl;
    }
     
    private boolean validarDuracion(int d) {
        try {
            if (d <= 0) {
                
                return false;
            }
            return true;
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato"+ e1.toString());
                
        }

    }

    private boolean validarInfo(String cod, String nom, String mod, String tit) {

        if (nom.length() == 0 || mod.length() == 0 || tit.length() == 0 || cod.length() == 0) {
            return false;
        }
        return true;

    }

    public boolean anadirCarrera(String cod, String nom, int d, String mod, String tit) {
        try {
            if (validarDuracion(d) && validarInfo(cod, nom, mod, tit)) {
                
                carrServiceImpl.anadirCarrera(new Carrera(cod, nom, d, mod, tit));
                return true;
            } else {

                System.err.println("Datos mal ingresados");
                return false;
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato"+e1.toString());
        }

    }

    public void borrarCarrera(int i) {
        carrServiceImpl.borrarCarrera(i);
    }

    public boolean modificarCarrera(int i, String cod, String nom, int d, String mod, String tit) {
        try {
            if (validarDuracion(d) && validarInfo(cod, nom, mod, tit)) {
                carrServiceImpl.modificarCarrera(i, new Carrera(cod, nom, d, mod, tit));
                return true;
            } else {
                System.err.println("Datos mal ingresados");
                return false;
            }
        }catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }

    }

    
    public ArrayList<Carrera> getLista() {
        return carrServiceImpl.getLista();
    }
    
    
}