/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
        

/**
 *
 * @author Norman
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



// TODO code application logic here
Scanner teclado = new Scanner(System.in);
        float num1;
        
        System.out.println("digite nota 1: ");
        num1 = teclado.nextFloat();
                
        if(num1>7){
            System.out.print("Aprobo la materia---");
        }
        else{
            if(num1 >= 6.50 && num1<=6.99){
                System.out.print("tiene la posibilidad de un examen de sufieincia");
            }
            
            else{
                System.out.print("dejo la amteria");
            }
        }

    }
}
        
        
    
    
