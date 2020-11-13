// 4.	Declarar un vector de enteros con capacidad máxima para 10 números, cargarlo
// con N números (N<=10) que corresponden a las edades de cada personal de la empresa.
// Mostrar las posiciones y las edades de aquellas personas próximas a jubilarse (Edad >= 60 años)
import java.util.Scanner;

class Ejercicio2{
	public static void main(String[] args){
		int edades[] = new int[10];
		String nombre[] = new String[10];
		Scanner scanner = new Scanner(System.in);

		// Llenar vectores
		for(int i = 0; i < 10; i++){

			System.out.println("Digite el nombre del empleado " + (i + 1));
			nombre[i] = scanner.next();

			System.out.println("Digite la edad del empleado: ");
			edades[i] = scanner.nextInt();

			System.out.println("");
		}

		// Leer vectores
		for(int i = 0; i < 10; i++){

			if(edades[i] >= 60){
				System.out.println("El empleado " + nombre[i] + " esta por pensionarse, tiene " + edades[i] + "anos");
			}
		}




	}
}