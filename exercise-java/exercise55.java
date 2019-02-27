//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 3:52 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise55{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input seconds: ");//impresion de mensaje
	int seconds= in.nextInt();//lectura del dato

	int hora= seconds/3600; //operacion para obtener horas
	int min= (seconds-(3600*hora))/60;//operacion para obtener minutos
	int segundos=seconds-((hora*3600)+(min*60));//operacion para obtener segundos

	System.out.println(hora+ ":" +min+ ":" +segundos);//impresion del resultado

 }

}

	
	