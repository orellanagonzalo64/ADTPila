/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTPila;

/**
 *
 * @author Gonzalo Orellana
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila p1 = new Pila();
        
        //Pruebo el metodo top con la pila vacia
        
        try{
        System.out.println(p1.top());
        }
        catch(Exception e){
            System.out.println("pila vacia");
        }
        
        //Pruebo el metodo pop con la pila vacia
        
        try{
        p1.pop();
        }
        catch(Exception e){
            System.out.println("pila vacia");
        }
        
        
        
        //Uso push
        
        p1.push('a');
        p1.push('l');
        p1.push('o');
        p1.push('h');
        
        p1.mostrar();
        
        //Pruebo el motodo top pero sin la pila vacia
        
        try{
        System.out.println(p1.top());
        }
        catch(Exception e){
            System.out.println("pila vacia");
        }
        
        
        //Pruebo el metodo pop sin la pila vacia
        
        try{
        p1.pop();
        }
        catch(Exception e){
            System.out.println("pila vacia");
        }
        
        
        p1.mostrar();
        
        
    }
    
}
