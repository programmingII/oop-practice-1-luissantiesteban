//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 11:20 pm

 

 public class exercise66{//inicio de la clase
 public static void main(String[] args){// inicio del main

	int acum=0;//variable para contar
	int suma=0;//variable para realizar suma
	for (int i=1;acum<100;i++){//ciclo for parapara recorrer los numeros del 1 al 100
            	int div= 0;// variable divisora
            	int X=0;//variable para el numero en el que se va
		for (int j=1;j<=i;j++){ //ciclo para encontrar los 100 num primos
                	X=j;
                	if ((i % j)==0) div++;
            	}
		if (div==2){//condicion para aumentar el contador
			suma+=i;
			acum++;
		}
	}
        System.out.println ("Result:" +suma);// impresion del resultado
 }	

		
}