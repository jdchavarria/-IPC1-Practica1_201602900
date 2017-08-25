
package practica1;

import java.util.Scanner;
public class Practica1 {

   
    public static void main(String[] args) {
        int entrada = 0;
        
       Scanner sc = new Scanner(System.in);
       System.out.println("\033[31mBienvenido a Snake");
     
       System.out.println("\033[34mIntroduzca el numero de la opcion");
       System.out.println("\033[35m1. Iniciar Partida");
       System.out.println("\033[36m2. Datos del Estudiante");
       System.out.println("\033[32m3. Historial de Partidas");
       System.out.println("\033[33m4. Salir");
       entrada=sc.nextInt();
       
       switch(entrada){
           case 1:
               Tablero tag = new Tablero();
               tag.iniciar_tablero();
               break;
               
           case 2:
               System.out.println("\033[31mJonatan Daniel Chavarria Gonzalez\n 201602900");
               
               break;
           case 3:
               
               System.out.println("Historial");
               Jugadores juga = new Jugadores();
               juga.almacenar();
               break;
               
           case 4:
               
               
               
               
       }
       
       
       
       
    }
    
}
