/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_proyecto;

import java.util.Scanner;

/**
 *
 * @author jjchi
 */
public class Primer_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        
        System.out.println("ingrese nombre");
                nombre=leer.next();
                
                System.out.println("hola" + nombre + "como estas");
                
               
    }
    
}
