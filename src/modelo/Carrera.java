
package modelo;

import java.io.Serializable;

public class Carrera implements Serializable{
    private String cod;
    private String nomb;
    private int duracion;
    private String modalidad;
    private String titulo;

    public Carrera(String cod, String nomb, int duracion, String modalidad, String titulo) {
        this.cod = cod;
        this.nomb = nomb;
        this.duracion = duracion;
        this.modalidad = modalidad;
        this.titulo = titulo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Carrera{" + "cod=" + cod + ", nomb=" + nomb + ", duracion=" + duracion + ", modalidad=" + modalidad + ", titulo=" + titulo + '}';
    }
    
    
}
