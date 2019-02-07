/*Luis Santiesteban
07-02-2019
12:35*/

import java.util.Scanner; /*importacion de la libreria para utilizar el Scanner*/

public class exercise6{  /*inicio de la clase*/

 public static void main(String[] args){ /*inicio del main*/
 
 Scanner in=new Scanner (System.in); /*creacion del Scanner*/

 System.out.println("Input first number:");/*imprime que ingreses el primer numero*/
 int X1 = in.nextInt(); /*lee el primer dato*/

 System.out.println("Input second number:"); /*imprime que ingreses el primer numero*/
 int X2 = in.nextInt(); /*lee el segundo dato*/
 
 System.out.println(X1+ "+" +X2+ "=" +(X1+X2)); /*suma de dos numeros y resultado impreso*/

 System.out.println(X1+ "-" +X2+ "=" +(X1-X2)); /*resta de dos numeros y resultado impreso*/

 System.out.println(X1+ "*" +X2+ "=" +(X1*X2)); /*multiplicacion de numeros y resultado impreso*/

 System.out.println(X1+ "/" +X2+ "=" +(X1/X2)); /*division de numeros y resultado*/

 System.out.println(X1+ " Mod " +X2+ " = " +(X1%X2)); /*mod de numeros y resultado*/
 }

}
 