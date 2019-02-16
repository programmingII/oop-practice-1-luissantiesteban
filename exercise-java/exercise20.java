/*Nombre: Luis Santiesteban
  Dia: 16/02/2019
  Hora: 12:56
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise20{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/

 System.out.println("Input a decimal number: "); //Impresion de mensaje
 int D1= in.nextInt();//Lectura del dato
 
 String H1= Integer.toString(D1,16);//Creacion de una nueva variable para depositar el resultado del casteo de la primer variable
 
 System.out.println("Hexadecimal number is: " +H1); //Impresion del resultado de la conversion 
 }

}
 


 