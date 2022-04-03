
package calculadora;


import java.util.Scanner;

public class Calculadora {

   


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Salir");
 
            
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                
                
            Clase1 Calculadora = new Clase1 ();

 
                switch (opcion) {
                    case 1 -> {
                       int Numero;
                       System.out.println("Has seleccionado la opcion 1");
                       System.out.println("ingrese el numero que desea operar");
                       Numero = sn.nextInt();
                       System.out.println(Calculadora.factorizacion1(Numero));
                    }


                    case 2 -> {
                        
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("ingrese el numero que desea operar");
       
                    }
                    case 3 -> {
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("ingrese el numero que desea operar");
                      
                        
                    }
                    case 4 -> System.out.println("Has seleccionado la opcion 4");
                    case 5 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 5");
                }
                
            } 
                }
            } 
        
 
    
 
        
    
         
        
    

     
    
    

