/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author USER
 */
public class Rectangulo extends Figuras {
    private Integer base;
    private Integer altura;
    
    //Constructor vacio
    public Rectangulo() {
       
       
    }
                
     public int getbase(){
         return base;
     }
     public void setbase (int base){
         this.base=base;
     }
      public int getaltura(){
         return altura;
     }
     public void setaltura (int altura){
         this.altura=altura;
     }
     
     public int calculararea() {
         area=base*altura;
         return area;
     }
}  

