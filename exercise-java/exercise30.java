/*Nombre: Luis Santiesteban
  Dia: 19/02/2019
  Hora: 11:35
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise30{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/

 System.out.println("Input a hexadecimal number: "); //Impresion de mensaje
 String H1= in.nextLine();//Lectura del dato
 
 int D1= Integer.parseInt(H1,16);//Creacion de una nueva variable para depositar el resultado del casteo de la primer variable

 String O1= Integer.toString(D1,8);//Crreacion de una nueva variable para depositar el resultado del casteo de la variable D1
 
 System.out.println("Equivalent of octal number is: " +O1); //Impresion del resultado de la conversion 
 }

}