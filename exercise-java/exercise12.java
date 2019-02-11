/*Nombre: Luis Santiesteban
  Dia: 11/02/2019
  Hora: 1:25
*/

 import java.util.Scanner; /*library import for scannner use*/

 public class exercise12{ /*start of the class*/
 
 public static void main(String[] args){ /*start of the main*/
 Scanner in= new Scanner (System.in); /*creation of the scanner*/

  System.out.println("Input first number: "); /*console priting message*/
  double X1 = in.nextDouble(); /*reading data*/

  System.out.println("Input second number: "); /*console priting message*/
  double X2 =  in.nextDouble(); /*reading data*/

  System.out.println("Input third number: "); /*console priting message*/
  double X3 = in.nextDouble(); /*reading data*/
 
  System.out.println("Average of three number is= " + (X1+X2+X3)/3); /*average calculation and impression*/
  }

}

 