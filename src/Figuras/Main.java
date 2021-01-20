/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
import  javax.swing.*;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crea el objeto de la clase figuras, con constructor vacio
        Figuras Figuras=new Figuras();
        //Llenamos los valores con los metodos set
        Figuras.setArea(60);
        Figuras.setPerimetro(100);
       
        //Se llama el metodo pintar area, que tiene el valor de 5 gracias al constructor
        Figuras.pintarArea();
        
        //Se llama el metodo pintar perimetro, que tiene el valor de 10 gracias al constructor
        Figuras.pintarPerimetro();
        
        //Se cambia el valor del atributo a traves de la
        Figuras.setArea(15);
        
        //Se llama el metodo pintar area, que tiene vlor 15 luego de modificar el valor
        Figuras.pintarArea();
        
    }
    
}
