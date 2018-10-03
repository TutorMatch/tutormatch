/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutormatch.beans;

/**
 *
 * @author hiromiakita
 */
public class Promedio {
    private int idProm;
    private int contador;
    private int promedio;
    private int suma;

    public Promedio() {
    }

    public Promedio(int idProm, int contador, int promedio, int suma) {
        this.idProm = idProm;
        this.contador = contador;
        this.promedio = promedio;
        this.suma = suma;
    }

    /**
     * @return the idProm
     */
    public int getIdProm() {
        return idProm;
    }

    /**
     * @param idProm the idProm to set
     */
    public void setIdProm(int idProm) {
        this.idProm = idProm;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the suma
     */
    public int getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    
    
}
