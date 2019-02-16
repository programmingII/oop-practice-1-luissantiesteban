/*Nombre: Luis Santiesteban
  Dia: 16/02/2019
  Hora: 2:25
*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise18{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/
 
 
 Scanner in=new Scanner(System.in); /*Creacion del scanner*/


 System.out.println("Input First Binary Number"); /*Impresion de mensaje para que ingreses el numero binario*/
 String B1=in.nextLine();/*lectura de la variable*/
 
 System.out.println("Input Second Binary Number");/*Impresion de mensaje para que ingreses el segundo numero binario*/
 String B2=in.nextLine();/*lectura de la variable*/

 int C1= Integer.parseInt(B1,2); /*Se declara una variable int para hacer el casteo del string y depositar la primer variable ahi*/
 int C2= Integer.parseInt(B2,2); /*Se declara una variable int para hacer el casteo del string y depositar la segunda variable ahi*/

 int R1 =(C1*C2); /* se crea nueva variable para depositar el resultado de la multiplicacion*/
 String R2 =Integer.toString(R1,2); /*Se crea una nueva variable string para depositar el resultado del casteo de la variable anterior*/
 
 System.out.println("Product of two binary numbers: " +R2);/* /*impresion del resultado de la multiplicacion en consola*/
 }

}