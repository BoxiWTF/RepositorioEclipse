package Ejercicios;

public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temperaturas = {11,12,-3,4,5.5,6,7};
		Datos d = new Datos(temperaturas);
		System.out.println(d);
		System.out.printf("El valor medio de las temperaturas es %.2f%n",d.calcularValorMedio());
		System.out.printf("El valor de la desviacion tipica es %.2f%n",d.calcularDesviacionTipica());
		System.out.printf("El numero de valores debajo de la media son %d%n",d.obtenerNumeroValoresDebajoMedia());
		System.out.printf("La temperatura maxima es %.2f%n",d.obtenerMaximaTemperatura());
		System.out.printf("La temperatura minima es %.2f%n",d.obtenerMinimaTemperatura());
		
	}

}
