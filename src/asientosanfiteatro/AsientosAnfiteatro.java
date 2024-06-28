package asientosanfiteatro;

import java.util.Scanner;

public class AsientosAnfiteatro {

    public static void main(String[] args) {
    
// comentario de prueba para github
        String asientos[][] = new String[10][10];

        for (int i = 0; i < asientos.length; i++) {

            for (int j = 0; j < asientos.length; j++) {

                asientos[i][j] = "L";

            }

        }

        int respuesta;
        int asiento = 0;
        boolean vandera = false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Desea reservar un asiento? ingrese (0 para seguir) o ( 1 para salir)");

        respuesta = entrada.nextInt();

        while (respuesta == 0) {

            int contador = 0;

            System.out.println("Ingrese un número de asieno del 0 al 99");
            asiento = entrada.nextInt();

            if (asiento >= 0 && asiento < 100) {

                for (int i = 0; i < asientos.length; i++) {

                    for (int j = 0; j < asientos.length; j++) {

                        if (asiento == contador) {
                            
                            if(asientos[i][j] == "X"){
                                
                                System.out.println("El asiento elegido no esta disponible");
                                vandera = true;
                                
                            }else{
                            asientos[i][j] = "X";

                            System.out.println("Asiento reservado con éxito");
                            vandera = true;
                            }
        
                        } else {
                            contador++;
                        }
                        
                        if(vandera==true){
                            break;
                        }

                    }
                     if(vandera== true){
                    break;
                }

                }
                
                vandera = false;

                System.out.println("Desea seguir reservando? Ingrese (0 para continuar) o ( 1 para salir)");

                respuesta = entrada.nextInt();

            } else {
                System.out.println("El número de asiento ingresado es incorrecto... asegurese de elegir un asiento dentro de los valores permitidos( 0-99 )+"
                        + "Ingrese (0 para continuar) o ( 1 para salir)");

                respuesta = entrada.nextInt();

            }

        }

        System.out.println("Hasta luego!!!");
        System.out.println("");

        
     
      for(int i = 0; i<asientos.length; i++ ){
         
         for (int j = 0; j < asientos.length; j++) {
             
             
             System.out.print("[" + asientos[i][j] + "]");
           
             
             
         }
          System.out.println("");
         
    }
    }

}
