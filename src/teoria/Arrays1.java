package teoria;

public class Arrays1 {

	public static void main(String[] args) {
		//creo la coleccion de numeros enteros
		int[] coleccionEnteros = new int[3];
		//añadimos elementos a la coleccion
		coleccionEnteros[0] = 1;
		coleccionEnteros[1] = 2;
		coleccionEnteros[2] = 3;
		//Recorremos la coleccion
		for (int i = 0; i < coleccionEnteros.length; i++) {
			System.out.println(coleccionEnteros[i]);
		}
		//Otra forma de recorrer la coleccion
		for (int i : coleccionEnteros) {
			System.out.println(i);
		}
		//creo una coleccion de cadenas
		String[] coleccionCadenas = new String[4];
		coleccionCadenas[0] = "hola";
		coleccionCadenas[1] = " ";
		coleccionCadenas[2] = "mundo";
		coleccionCadenas[3] = "\n";
		for (String string : coleccionCadenas) {
			System.out.print(string);
		}
		//creamos una coelccion de doubles inicializada
		double[] coleccionDouble = {1.2, 1.5, -23.65, 0.005, 7};
		for (double d : coleccionDouble) {
			System.out.printf("%9.3f",d);
		}
	}

}
