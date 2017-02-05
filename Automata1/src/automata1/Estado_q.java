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
public class Estado_q {
    private String nombre;
    private boolean isFinal, isInic;
    private Transiçao[] transiçaos;

    public Estado_q(String nombre, boolean isFinal, boolean isInic) {
        this.nombre = nombre;
        this.isFinal = isFinal;
        this.isInic = isInic;
    }
    
    public void InicVec(short tamaño){
        transiçaos = new Transiçao[tamaño];
    }
    
    public void vervictor(){
        for(short i =0; i<transiçaos.length;i++){
            System.out.print(transiçaos[i]+ " ") ;
        }
    }
    
}
