/*Nombre: Luis Santiesteban
  Dia: 19/02/2019
  Hora: 1:25
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise21{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/

 System.out.println("Input a decimal number: "); //Impresion de mensaje
 int D1= in.nextInt();//Lectura del dato
 
 String O1= Integer.toString(D1,8);//Creacion de una nueva variable para depositar el resultado del casteo de la primer variable
 
 System.out.println("Octal number is: " +O1); //Impresion del resultado de la conversion 
 }

}