/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerinas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Escalerinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int u; //Declaración de variables
        Scanner sc = new Scanner(System.in); //Creación del escanner
        System.out.println("Holi, introduzca el número de escalones"); 
        u = sc.nextInt();
        System.out.println("Iniciar descenso...");
        System.out.println(baja.bajar(u));   // TODO code application logic here
        
    }
    
}
