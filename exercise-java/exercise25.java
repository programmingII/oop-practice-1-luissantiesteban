/*Nombre: Luis Santiesteban
  Dia: 19/02/2019
  Hora: 2:00
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise25{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/

 System.out.println("Input any octal number: "); //Impresion de mensaje
 String O1= in.nextLine();//Lectura del dato
 
 int D1= Integer.parseInt(O1,8);//Creacion de una nueva variable para depositar el resultado del casteo de la primer variable

 
 
 System.out.println("Equivalent Decimal number: " +D1); //Impresion del resultado de la conversion 
 }

}