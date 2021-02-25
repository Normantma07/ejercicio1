/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Norman
 */
public class ejercicio4 {
    Scanner teclado = new Scanner(System.in);
    int num1,num2;
    
    System.out.println("digite numero 1: ");
    num1 = teclado.nextInt();
    
    System.out.println("digite numero 2: ");
        num2 = teclado.nextInt();
        
    if(num1%num2 == 0 ){
    
    System.out.print("el numero " + num1 + "es divisible con el num " + num2);
    
}
    else{
    System.out.print("los numeros no son divisible");
}
    
    
}
