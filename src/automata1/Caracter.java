/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata1;

/**
 *
 * @author user
 */
public class Caracter {
    private char caracter;
    private Caracter CarSig, CarAnt;

    public Caracter() {
        this.caracter = '\0';
        this.CarSig = null;
        this.CarAnt = null;
    }

    public Caracter(char caracter, Caracter siguiente, Caracter anterior) {
        this.caracter = caracter;
        this.CarSig = siguiente;
        this.CarAnt = anterior;
    }

    public char getCaracter() {
        return caracter;
    }

    public Caracter getCarSig() {
        return CarSig;
    }

    public Caracter getCarAnt() {
        return CarAnt;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
    
    public void setCarSig(Caracter CarSig) {
        this.CarSig = CarSig;
    }

    public void setCarAnt(Caracter CarAnt) {
        this.CarAnt = CarAnt;
    }

    @Override
    public String toString() {
        return "caracter: " + caracter;
    }
    
    
    
}
