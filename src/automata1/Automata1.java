/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata1;

import Excepciones.ExcepcionCaracterYaExiste;

/**
 *
 * @author user
 */
public class Automata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionCaracterYaExiste {
        // TODO code application logic here
        /*Alfabeto alfa = new Alfabeto();
        alfa.AgregarCar('H');
        alfa.AgregarCar('M');
        alfa.AgregarCar('C');
        alfa.AgregarCar('J');
        alfa.AgregarCar('Y');
        System.out.print(alfa.toString());*/
        Estado_q estado = new Estado_q("A",true,true);
        estado.InicVec((short)5);
        estado.vervictor();
    }
    
}
