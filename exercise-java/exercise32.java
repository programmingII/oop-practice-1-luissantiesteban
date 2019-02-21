/*Nombre: Luis Santiesteban
  Dia: 21/02/2019
  Hora: 12:47
*/

import java.util.Scanner; //importacion del scanner
public class exercise32{ //inicio del main
 public static void main(String[] args){ //inicio del main
  
  Scanner in = new Scanner(System.in); //creacion del scanner
  
  System.out.println("input first Integer: ");//se imprime una linea de texto
  int num1 = in.nextInt(); // se leen los datos

  System.out.println("input second Integer: ");//se imprime una linea de texto
  int num2 = in.nextInt(); // se leen los datos

  if(num1 == num2) //comparacion de numeros 
  System.out.println(num1+ "==" +num2);//impresion del resultado si los numeros son iguales
  if(num1 != num2)//comparacion          
  System.out.println(num1+"!=" +num2); //impresion de la comparacion 
  if (num1 < num2)  //comparacion        
  System.out.println(num1+ "<" +num2);  //impresion de la comparacion
  if (num1 > num2)//comparacion          
  System.out.println(num1+ ">" +num2 );  //impresion de la comparacion
  if (num1 <= num2)//comparacion          
  System.out.println( num1+ "<=" +num2 );  //impresion de la comparacion
  if (num1 >= num2) //comparacion     
  System.out.println( num1+ ">=" +num2); //impresion de la comparacion  
  }


}
 
