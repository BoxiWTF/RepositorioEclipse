package teoria;

public class Arrays2 {
	public static void main(String[] args) {
		//declaramos un array bisdimensional de enteros
		final int TAMANO_FILAS = 3;
		final int TAMANO_COLUMNAS = 3;
		int[][] coleccionBidimensionalEnteros = new int[TAMANO_FILAS][TAMANO_COLUMNAS];
		//primera fila
		coleccionBidimensionalEnteros[0][0] = 0;
		coleccionBidimensionalEnteros[0][1] = 1;
		coleccionBidimensionalEnteros[0][2] = 2;
		//segunda fila
		coleccionBidimensionalEnteros[1][0] = 3;
		coleccionBidimensionalEnteros[1][1] = 4;
		coleccionBidimensionalEnteros[1][2] = 5;
		//tercera fila
		coleccionBidimensionalEnteros[2][0] = 6;
		coleccionBidimensionalEnteros[2][1] = 7;
		coleccionBidimensionalEnteros[2][2] = 8;
		//recorremos el array
		for (int i = 0; i < coleccionBidimensionalEnteros.length; i++) {
			for (int j = 0; j < coleccionBidimensionalEnteros[i].length; j++) {
				System.out.println(coleccionBidimensionalEnteros[i][j]);
			}
		}
		//cambiamos el bucle
		for (int[] is : coleccionBidimensionalEnteros) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		System.out.println("_______________________________________________________");
		//ahora creamos la coleccion tridimensional y la inicializamos
		int[][][] coleccionTridimensionalEnteros = {
				{ {1,2}, {3,4} },
				{ {5,6}, {7,8} },
				{ {9,10}, {11,12} }
		};
		//recorremos el array
		for (int[][] is : coleccionTridimensionalEnteros) {
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.println(i);
				}
			}
		}
		
		
	}
}
