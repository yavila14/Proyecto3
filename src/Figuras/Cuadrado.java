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
public class Cuadrado  extends Figuras{
      private Integer lado;
      
   //Constructor vacio
    public Cuadrado() {
       
       
    }
                
     public int getlado(){
         return lado;
     }
     public void setlado (int lado){
         this.lado=lado;
     }
     
     public int calculararea() {
         area=lado*lado;
         return area;
     }
    
}
    
   

  
    
   
        
        
    
