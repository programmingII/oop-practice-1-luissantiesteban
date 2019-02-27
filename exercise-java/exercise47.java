//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 1:30 pm

 import java.text.SimpleDateFormat;//importacion de la libreria
 import java.util.Calendar;//importacion de la libreria
 import java.util.TimeZone;//importacion de la libreria

 public class exercise47{//inicio de la clase
 public static void main(String[] args){// inicio del main

	SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS"); //Creacion del objeto date
	date.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT-7")));//zona horaria
		
	System.out.println("Now: "+date.format(System.currentTimeMillis()));//impresion
	}


}