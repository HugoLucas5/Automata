/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata1;

/**
 *
 * @author hugolucas
 */
public class NodoParejaComp {
    private Estado_q est1;
    private Estado_q est2;
    private NodoParejaComp iz;
    private NodoParejaComp der;

    public NodoParejaComp(Estado_q est1, Estado_q est2, NodoParejaComp iz, NodoParejaComp der) {
        this.est1 = est1;
        this.est2 = est2;
        this.iz = iz;
        this.der = der;
    }

    public NodoParejaComp() {
        this.der=null;
        this.iz=null;
        this.est1=null;
        this.est2=null;
    }

    public Estado_q getEst1() {
        return est1;
    }

    public Estado_q getEst2() {
        return est2;
    }

    public NodoParejaComp getIz() {
        return iz;
    }

    public NodoParejaComp getDer() {
        return der;
    }

    public void setEst1(Estado_q est1) {
        this.est1 = est1;
    }

    public void setEst2(Estado_q est2) {
        this.est2 = est2;
    }

    public void setIz(NodoParejaComp iz) {
        this.iz = iz;
    }

    public void setDer(NodoParejaComp der) {
        this.der = der;
    }
    
    
    
    
}
