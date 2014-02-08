/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {
		int num1;
		num1 = Integer.parseInt(args[0].toString());
		for( int num2 = 0;num2 <= num1;num2++){
		System.out.print(+num2+" ");
	
	if(num2%3==0){
		System.out.print("Flip");
	}
	if(num2%5==0){
		System.out.print("Flop");
	}	
	System.out.println();
	
	}
}}