/*Nombre: Luis Santiesteban
  Dia: 07-02-2019
  Hora: 12:47*/

import java.util.Scanner; /*importacion de la libreria para usar scanner*/

public class exercise7{ /*inicio de la clase*/
 public static void main(String[]args){ /*inicio del main*/

  Scanner in = new Scanner(System.in); /*creacion del scanner*/
  
  System.out.println("Input a number:"); /*imprime cadena de texto: ingrese numero*/
  int X1 = in.nextInt(); /*lee el dato ingresado por teclado*/
 
  for(int i=1; i<11; ++i){ /*creacion de un ciclo for: termina cuando i=10*/

  System.out.println(X1+ "*" +i+ "=" +(X1*i)); /*imprime la multiplicacion del numero ingresado en el teclado*/

  }
 }
}
  
  
