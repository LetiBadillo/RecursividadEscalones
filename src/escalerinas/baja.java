/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerinas;

/**
 *
 * @author ASUS
 */
public class baja {
    
    public static int bajar (int i){
	if (i==0){ //caso base
        System.out.println("Terminaste de bajar las escaleras :'DDD");
        return i;
	} else{
        System.out.println(""+i);
	return (bajar(i-1));
        }
}
    
}
