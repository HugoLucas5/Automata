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
public class ArbolComp {
    private NodoParejaComp raiz;
    private int tamaño=0;
    

    public ArbolComp() {
        this.tamaño=0;
        raiz = new NodoParejaComp();
    }

    public NodoParejaComp getRaiz() {
        return raiz;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void insertar(NodoParejaComp automata1,NodoParejaComp automata2){
        if(tamaño==0){
            raiz.setEst1(automata1.getEst1());
            raiz.setEst2(automata2.getEst2());
        }
        
    }
    
    
    
    
 
   
    
    
}
