/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.debug;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *Escribe un programa en Java que solicite números enteros
  positivos hasta que el usuario quiera y por cada número
  introducido deberÃ¡ decirnos si se trata de un número deficiente
  (Número natural que cumple que la suma de sus divisores propios
  es menor que el propio número) o no. Utiliza la clase
  JOptionPane.

 * @author daw1
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
	String entrada;
	String mensaje;
	int acumulador;
        
        entrada=JOptionPane.showInputDialog(null,"Introduzca un numero entero positivo ");
        n=Integer.parseInt(entrada);
        while(n>0){
            acumulador=0;
            for(int i=1;i<=n/2;i++){
		if(n%i==0){
                    acumulador+=i;
		}
            }
        if(acumulador<n){
			mensaje="El número es deficiente";
		}
		else{
			mensaje="El número NO es deficiente";
		}
        JOptionPane.showMessageDialog(null,mensaje);
	entrada=JOptionPane.showInputDialog(null,"Introduzca un numero entero positivo ");
	n=Integer.parseInt(entrada);
	
        }
    } 
}
