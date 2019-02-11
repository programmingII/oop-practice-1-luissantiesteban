/*Nombre:Luis Santiesteban
  Dia:11-02-2019
  Hora:1:50
*/
 import java.util.Scanner; /*importacion de la libreria de para uso de scanner*/

 public class exercise11{ /*inicio de la clase*/
 public static void main(String[]args){ /*inicio del main*/

 Scanner in = new Scanner(System.in); /*creacion del scanner*/
 
 System.out.println("Input teh radius of the circle: ");/*comando de impresion*/
 double Rad = in.nextDouble(); /*ingresas dato y lo lee*/

 double Perimeter=(2*Rad*Math.PI); /*declaracion e iniciacion de variable Perimeter*/
 double Area=Math.pow(Rad,2)*Math.PI; /*declaracion de iniciacion de variable Area*/

 System.out.println("Perimeter is = " + Perimeter); /*impresion de la variable Perimeter*/
 System.out.println("Area is = " + Area); /*impresion de la variables Area*/
 }
}
 
 
 