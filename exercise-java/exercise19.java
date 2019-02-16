/*Nombre: Luis Santiesteban
  Dia: 16/02/2019
  Hora: 2:38
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise19{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/
 
 System.out.println("Input a decimal number: ");/*Mensaje por consola*/
 int D1= in.nextInt();/*Lectura del entero*/
 
 String B1= Integer.toString(D1,2); /*Se crea una nueva variable para depositar el resultado del casteo de int a string*/
 
 System.out.println("Binary number is: "+B1); /*Impresion del resultado de la conversion*/
 }

}


 