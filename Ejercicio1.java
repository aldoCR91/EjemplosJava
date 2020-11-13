//1.	Un ingeniero industrial tiene a su cargo la supervisión del procesamiento
// de horneado de piezas pre-moldeadas, para lo cual requiere mantener actualizada
// diariamente la correspondiente Planilla de Control de Carga de tres hornos con
//capacidad máxima de 50 jaulas cada uno. Cada jaula permite, a su vez, una capacidad
// TOPE indicada.  Dada una lista de N valores correspondientes a cantidades de piezas
// cargadas por jaula, mostrar la planilla resultante con las siguientes
// columnas: Horno, número de Jaula y la Cantidad de Piezas cargadas

import java.util.Scanner;

class Ejercicio1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int nPiezas;
		int contador = 1;

		System.out.println("Digete el tope de piezas por jaula");
		nPiezas = scanner.nextInt();


		int matriz[][][] = new int[3][50][nPiezas];

		// Rellenando mis tres dimensiones
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 50; j++){
				for(int k = 0; k < nPiezas; k++){
					matriz[i][j][k] = contador;
					contador++;
				}
			}
		}

		// mostrar lo almacenado
		for(int i = 0; i < 3; i++){
			System.out.println("*** Horno *** => " + (i + 1));
			for(int j = 0; j < 50; j++){
				System.out.println("	*** Jaula *** " + (j + 1));
				for(int k = 0; k < nPiezas; k++){
					//System.out.println("*** Horno *** *** Jaula ***  *** Piezas ***");
					System.out.println(" 		*** Piezas ***" + " => " + matriz[i][j][k]);
				}
			}
		}




	}
}