/*Nombre: Luis Santiesteban
  Dia: 19/02/2019
  Hora: 1:35
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise22{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/

 System.out.println("Input a binary number: "); //Impresion de mensaje
 String B1= in.nextLine();//Lectura del dato
 
 int D1= Integer.parseInt(B1,2);//Creacion de una nueva variable para depositar el resultado del casteo de la primer variable
 
 System.out.println("Decimal number is: " +D1); //Impresion del resultado de la conversion 
 }

}