/*Nombre: Luis Santiesteban
  Dia: 19/02/2019
  Hora: 1:48
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise23{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/

 System.out.println("Input a binary number: "); //Impresion de mensaje
 String B1= in.nextLine();//Lectura del dato
 
 int D1= Integer.parseInt(B1,2);//Creacion de una nueva variable para depositar el resultado del casteo de la primer variable

 String H1= Integer.toString(D1,16);//Creacion de una nueva variable para depositar el casteo de la variable D1
 
 System.out.println("Hexadecimal number is: " +H1); //Impresion del resultado de la conversion 
 }

}
