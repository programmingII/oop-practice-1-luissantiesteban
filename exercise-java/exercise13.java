/* Nombre: Luis Santiesteban
   Dia: 11/02/2019
   Hora: 3:00*/

import java.util.Scanner; /*library import for scannner use*/

 public class exercise13{ /*start of the class*/

  public static void main(String[] args){ /*start of the main*/
  
  Scanner in = new Scanner(System.in); /*creation of the scanner*/
  
  System.out.println("enter rectangle height "); /*Console priting message*/
  double X1= in.nextDouble(); /*reading data*/

  System.out.println("enter rectangle width "); /*Console priting message*/
  double X2= in.nextDouble(); /*reading data*/
  
  System.out.println("Area is " +X1+ "*" +X2+ "=" +(X1*X2)); /* area operation and data priting*/
  System.out.println("Perimeter is 2 * ("+X1+ "+" +X1+ ") = "+2*(X1+X2)); /*perimeter operacion and data priting*/
}
}
  