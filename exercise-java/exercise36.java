//Nombre: Luis Santiesteban
//Dia: 25/02/2019
//Hora: 6:10 pm
 
 import java.util.Scanner; //Importacion del Scanner
 
 public class exercise36{ //Inicio de la clase
 public static void main(String[]args){ //Inicio del main

	Scanner in = new Scanner(System.in);

	System.out.println("Input the latitude of coordinate 1: ");//impresion en pantalla
        double Lat1 = in.nextDouble();//Lectura de latitud 1

        System.out.println("Input the longitude of coordinate 1: ");//impresion en pantalla
        double Long1 = in.nextDouble();//Lectura de longitud 1

        System.out.println("Input the latitude of coordinate 2: ");//impresion en pantalla
        double Lat2 = in.nextDouble();//Lectura de latitud 2

        System.out.println("Input the longitude of coordinate 2: ");//impresion en pantalla
        double Long2 = in.nextDouble();//Lectura de longitud 2

	
	double R=6371.01; //radio de la tierra
	
	//conversion a radianes de todas las variables
	Lat1= Math.toRadians(Lat1);
	Long1= Math.toRadians(Long1);
	Lat2= Math.toRadians(Lat2);
        Long2=Math.toRadians(Long2);

	double RF= R*Math.acos(Math.sin(Lat1)*Math.sin(Lat2)+ Math.cos(Lat1)*Math.cos(Lat2)*Math.cos(Long1-Long2));//Operacion matematica que nos dara el resultado entre dos puntos(uso de la clase math)

	System.out.println("The distance between those point is: " +RF+" KM");//impresion del resultado
	}

}

	
         

