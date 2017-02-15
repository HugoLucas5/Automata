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
    private boolean isFinal, isInicial;
    private Transiçao[] transiçaos;
    
    

    public Estado_q(String nombre, boolean isFinal, boolean isInicial) {
        this.nombre = nombre;
        this.isFinal = isFinal;
        this.isInicial= isInicial;
    }
    
    public void InicVec(short tamaño){
        transiçaos = new Transiçao[tamaño];
    }
    
    public void vervictor(){
        for(short i =0; i<transiçaos.length;i++){
            System.out.print(transiçaos[i]+ " ") ;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getIsFinal() {
        return isFinal;
    }

    public Transiçao getTransiçaos(short posiçao) {
        return transiçaos[posiçao];
    }
     public Transiçao[] getTransiçaos() {
        return transiçaos;
    }

    public boolean getIsInicial() {
        return isInicial;
    }

    
    
    
    
    
}
