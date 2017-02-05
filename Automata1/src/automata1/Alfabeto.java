/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata1;
import Excepciones.*;
/**
 *
 * @author user
 */
public class Alfabeto {
    private Caracter inicio, fin;
    private short tamaño;

    public Alfabeto() {
        this.inicio = new Caracter();
        inicio.setCarSig(fin);
        this.fin = new Caracter();
        fin.setCarAnt(inicio);
        this.tamaño = 0;
    }
    
    public void AgregarCar(char letra) throws ExcepcionCaracterYaExiste{
        if(tamaño==0){
            Caracter nuevo = new Caracter(letra, fin, inicio);
            inicio.setCarSig(nuevo);
            fin.setCarAnt(nuevo);
            tamaño++;
        }
        else{
            Caracter iterador = inicio.getCarSig();
            while((iterador.getCarSig()!=fin)&&(letra!=iterador.getCaracter())){
                iterador = iterador.getCarSig();
            }
            if(letra==iterador.getCaracter()){
                throw new ExcepcionCaracterYaExiste("El caracter ingresado ya existe, ingrese uno diferente");
            }
            Caracter nuevo = new Caracter(letra, fin, iterador);
            iterador.setCarSig(nuevo);
            fin.setCarAnt(nuevo);
            tamaño++;
        }
    }
    
    @Override
    public String toString(){
        Caracter iterador = inicio.getCarSig();
        String caracteres = "tamaño: " + tamaño + "\n";
        while(iterador!=fin){
            caracteres += iterador.getCaracter() + " ";
            iterador = iterador.getCarSig();
        }
        return caracteres;
    }
}
