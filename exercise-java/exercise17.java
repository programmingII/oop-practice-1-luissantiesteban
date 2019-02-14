/*Nombre: Luis Santiesteban
  Dia: 14/02/2019
  Hora: 12:30
*/
 
 import java.util.Scanner; /*library import for scanner use*/

 public class exercise17{ /*start of the class*/
 public static void main(String[] args){ /*start of the main*/
 
 
 Scanner in=new Scanner(System.in); /*creation of the scanner*/


 System.out.println("Input First Binary Number");
 String B1=in.nextLine();
 
 System.out.println("Input Second Binary Number");
 String B2=in.nextLine();

 int C1= Integer.parseInt(B1,2);
 int C2= Integer.parseInt(B2,2);

 int R1 =(C1+C2);
 String R2 =Integer.toString(R1,2);
 
 System.out.println("Sum of two binary numbers: " +R2);
 }

}
