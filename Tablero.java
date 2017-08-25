
package practica1;
import java.util.Scanner;
public class Tablero{
    int tamano_x;
    int tamano_y;
    int tamano_snake;
    char [][]tab;
    int filaposicion;
    int columnaposicion;
    String caracter = " " ;
    int contador= 0;
    String direccion;
   int aleatorio_x=0;
   int aleatorio_y=0;
    Scanner tam = new Scanner(System.in);
    
    
    public Tablero(){
        
        iniciar_tablero();
        
    }
    
    
    public void iniciar_tablero(){
        
        //do{
         System.out.println("\033[31mingrese el tamaño horizontal del tablero:");
         tamano_x= tam.nextInt();
         System.out.println("\033[32mIngrese el tamaño vertical del tablero");
         tamano_y= tam.nextInt();
         if(tamano_x<1 && tamano_y<1){
             System.out.println("El tablero no puede tener un tamaño menor de 1");
        }else{
             construirTablero(tamano_x,tamano_y);
             System.out.println("Se ha creado un tablero de "+tamano_x *+tamano_y);
            Jugadores juga = new Jugadores();
            juga.almacenar();
        System.out.println("Ingrese el tamaño inicial de snake");
        tamano_snake= tam.nextInt();
        System.out.println("\033[34mingrese la fila inicial del snake");
        filaposicion= tam.nextInt()-1;
        System.out.println("\033[35mIngrese la columna inicial del snake");
        columnaposicion= tam.nextInt()-1;
        imprimirTablero();
       
        //break;
         }
        
        /*}*/while(true){
        limpiatablero();
        int puesto = 0;
        System.out.println("En que direccion desesa mover el snake arriba:W; abajo:s; derecha:D; izquierda:A");
        direccion= tam.next();
        switch(direccion){
            case "w":
                if(filaposicion>1){ 
                    tab[filaposicion-1][columnaposicion]= '@';
                    puesto ++;
                    filaposicion--;
                    imprimirTablero();
                    break;
                }else{
                    System.out.println("ingrese otra coordenada");
                }
            case "s":
                if(filaposicion<tamano_y){
                    tab[filaposicion][columnaposicion]= '@';
                    puesto++;
        /*if(aleatorio_x!=filaposicion && aleatorio_y!= columnaposicion){
            tab[aleatorio_x][aleatorio_y]='*';
        }else{
            System.out.print("8");
        }*/
                      
                    filaposicion++;
                    generacionfrutos();
                    imprimirTablero();
                    break;
                }else{
                    System.out.println("Ingrese otra coordenada");
                }
            case "d":
                if(columnaposicion< tamano_y){
                    tab[filaposicion][columnaposicion]= '@';
                    puesto++;
                    columnaposicion++;
                    imprimirTablero();
                    break;
                }else{
                    System.out.println("Ingrese otra coordenada");  
                }
            case "a":
                if(columnaposicion<tamano_x-1){
                    tab[filaposicion][columnaposicion]='@';
                    puesto++;
                    columnaposicion--;
                    imprimirTablero();
                    break;
                }else{
                    System.out.println("Ingrese otra coordenada");
                }
        }
        if(direccion=="w"){
             filaposicion=filaposicion--;
        }else{
            if(direccion=="s"){
                filaposicion = filaposicion++;
            }else{
                if(direccion=="d"){
                    columnaposicion = columnaposicion++;
                }
            }
            if(direccion=="a"){
                columnaposicion =columnaposicion--;
            }
        }
    }
      
    }
    public void generacionfrutos(){
        //do{
           aleatorio_x= (int)(Math.random()*(tamano_x-0)+0);
           aleatorio_y= (int)(Math.random()*(tamano_y-0)+0);
        
        if(aleatorio_x!= filaposicion && aleatorio_y!= columnaposicion){
           //if(tab[filaposicion][columnaposicion]==' '){
               tab[aleatorio_x][aleatorio_y]='*';
           }else{
             System.out.println("no");
             
           }
        //}while(true);
        
        }
   // }
   
    
    public void construirTablero(int tamano_x,int tamano_y){
        tab = new char[tamano_x][tamano_y];
        
    }
    
    public void imprimirTablero(){
        if(filaposicion>=tamano_x && filaposicion>=tamano_y || columnaposicion>=tamano_x && columnaposicion>=tamano_y){
            System.out.println("No se puede ingresar esa coordenada");
        }else{
            if(tamano_snake>tamano_x && tamano_snake>tamano_y){
                System.out.println("NO se puede ingresar ese tamaño de SNAKE");
            }else{
                while(contador<=tamano_snake-1){
                    caracter = caracter +"@";
                    contador ++;
                }
                for(int i=0; i<tamano_x; i++){
                   for(int j=0; j<tamano_y; j++){
               System.out.print("|");
               System.out.print("--");
               System.out.print("|");
                      System.out.print(tab[i][j]+ "\t");
                    
            }
                    System.out.println();
                    
        }      
                
            }
        
    }
    
    
}
    public void limpiatablero(){
        for(int nulla = 0; nulla<tamano_x; nulla++){
            for(int nullb=0; nullb<tamano_y; nullb++){
                tab[nulla][nullb] = ' ';
            }
        }
    }
    
   
}

