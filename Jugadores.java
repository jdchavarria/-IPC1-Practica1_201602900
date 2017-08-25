
package practica1;
import java.util.Scanner;

public class Jugadores {
   
    String nombre;
    public Jugadores(){
        almacenar();
    }
    Scanner tip = new Scanner(System.in);
    public void almacenar(){
        System.out.println("Ingrese usuario");
        //nombre= tip.nextLine();
         String [] jugador= new String[5];
         for( int i=0; i<jugador.length; i++){
             nombre= tip.nextLine();
             jugador[i]=nombre;
             System.out.println("jugador"+ jugador[i]);
            //for(int j=0; j<jugador.length; j++){
             // System.out.println("Usuario creado: "+jugador[i].getNombre());
            //}
         
             
             
             
    }
     
    
}
    
}
