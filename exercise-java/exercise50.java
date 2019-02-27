//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 2:16 pm

 public class exercise50{//inicio de la clase
 public static void main(String[] args){// inicio del main

	for(int i=1; i<=100; i++){//se repite el proceso hasta que i vale 100

	if(i%3==0){//condicion para imprimir si el numero es divisible entre 3
	System.out.println("Dividide by 3: "+i);}//impresion

	if(i%5==0){//condicion para imprimir si el numero es divisible entre 5
	System.out.println("Dividide by 5: "+i);}//impresion

	if(i%3==0 && i%5==0){//condicion para imprimir si el numero es divisible entre 3 y 5
	System.out.println("Dividide by 3 and 5: "+i);}//impresion
	
	}
 }

} 