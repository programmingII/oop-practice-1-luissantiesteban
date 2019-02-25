/*Nombre: Luis Santiesteban
  Dia: 21/02/2019
  Hora: 12:55*/
 
 import java.util.Scanner; /*Importacion de libreria para hacer uso del scanner*/

 public class exercise33{ /*Inicio de la clase*/
 public static void main(String[] args){ /*Inicio del main*/

 Scanner in=new Scanner(System.in); /*Creacion del scanner*/
 
 System.out.println("Input a integer: ");//impresion de mensaje
 long num = in.nextLong();//lectura del dato
 
 int sum = 0; //declaracion de acumulador
 while (num != 0) { el ciclo se repite mientras el numero sea diferente de cero
 sum += num % 10; //ultimo digito
 num /= 10; // digito inicial
   }

 System.out.println("the sum of the digits is:" +sum); //impresion del resultado
 }

}
 
 
 
