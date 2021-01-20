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
public class Figuras {
   //Definicion de atributos publicos area y perimetro
    private Integer area;
    private Integer perimetro;
    
    //Constructor vacio
     public Figuras(){
        
    }
     
     //Metodo get que retorna el valor del atributo area
     public Integer getArea(){
        return area;
    }
     
     //Metodo Set que permite llenar el valor del atributo area 
     public void setArea(Integer area){
        this.area=area;
    }
    
     //Metodo get que retorna el valor del atributo perimetro
     public Integer getPerimetro(){
        return perimetro;
    }
     
    //Metodo Set que permite llenar el valor del atributo perimetro
     public void setPerimetro(Integer perimetro){
        this.perimetro=perimetro;
}
    //Metodo para pintar el valor de la variable en consola
    public void pintarArea(){
        System.out.println(this.area);
        
     }
    public void pintarPerimetro(){
        System.out.println(this.perimetro);
        
     }
}
