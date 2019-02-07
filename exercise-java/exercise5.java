/*Luis Santiesteban Murillo
07-02-2019
12:21*/

import java.util.Scanner; /*Importacion de libreria para scanner*/

public class exercise5{
 public static void main(String[]args){
  Scanner in =new Scanner(System.in); 

  System.out.println("Input first number"); /*imprime en cosola*/
  int X1 = in.nextInt(); /*lee el primer dato ingresado*/
 
  System.out.println("Input second number"); /*imprime en consola*/
  int X2 = in.nextInt(); /*lee el segundo dato ingresado*/
 
  System.out.println(X1+ "x" +X2+ "=" +(X1*X2)); /*imprime el resultado de la multiplicacion de los dos numeros*/
  }

}

 
 
