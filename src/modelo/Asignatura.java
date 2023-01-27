
package modelo;

import java.io.Serializable;


public class Asignatura implements Serializable{
    private String cod;
    private String nomb;
    private int nivel;
    private int creditos;
    private int numEst;

    public Asignatura(String cod, String nomb, int nivel, int creditos, int numEst) {
        this.cod = cod;
        this.nomb = nomb;
        this.nivel = nivel;
        this.creditos = creditos;
        this.numEst = numEst;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNumEst() {
        return numEst;
    }

    public void setNumEst(int numEst) {
        this.numEst = numEst;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "cod=" + cod + ", nomb=" + nomb + ", nivel=" + nivel + ", creditos=" + creditos + ", numEst=" + numEst + '}';
    }
    
    
}
