 // 1.Programa  que lea 10 números enteros por teclado, los guarde en un arreglo.  Luego calcule y muestre el promedio de los números que estén en las posiciones impares del arreglo.    Considere la primer  posición del arreglo (posición 0) como impar.

 import java.util.Scanner;

 class PracticaMatrices{
	public static void main(String[] args){

		// variables
		int vector[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		int suma = 0;
		float promedio;  // ojo porque el numero puede tener decimales

		// pedir numeros al usuario 10 veces
		for(int i = 0; i < 10; i++){
			System.out.println("Digite un numero: ");
			vector[i] = scanner.nextInt();
		}

		// Recorremos el vector
		for(int j =0; j < 10; j++){

			// sumamos si la posicion es igual a 0
			if(j == 0){
				suma += vector[j];
			}
			// sumamos si la posicion es impar
			if(j % 2 != 0){
				suma += vector[j];
			}

		}

		System.out.println("El valor de la suma es: " + suma);
		promedio= suma / 10;

		System.out.println("El promedio es: " + promedio);




	}
}