package Ejercicios;

import java.util.Arrays;

public class Datos {
	//atributo
	private double[] temperatura;
	//constructor
	public Datos(double[] temperatura) {
		this.temperatura = temperatura;
	}
	//metodo toString
	@Override
	public String toString() {
		return Arrays.toString(temperatura);
	}
	//metodo que devuelve el valor medio
	public double calcularValorMedio() {
		double suma=0;
		for (double d : temperatura) {
			suma += d;
		}
		double media= suma/(temperatura.length)*1.0;
		return media;
	}
	//Calculamos la desviacion tipica
	public double calcularDesviacionTipica() {
		double sumatorio=0;
		double desviacionTipica=0;
		for (double d : temperatura) {
			sumatorio += Math.pow(d-calcularValorMedio(),2);
			desviacionTipica = Math.sqrt(sumatorio/temperatura.length);
		}
		return desviacionTipica;
	}
	//Contamos que valores estan por debajo de la media
	public int obtenerNumeroValoresDebajoMedia() {
		int contador =0;
		for (double d : temperatura) {
			if(d<calcularValorMedio()) {
				contador++;
			}
		}
		return contador;
	}
	//calcular el valor maximo del array
	public double obtenerMaximaTemperatura() {
		double maxima=temperatura[0];
		for (double d : temperatura) {
			if(d>maxima) {
				maxima=d;
			}
		}
		return maxima;
	}
	//caluclar el valor minimo del array
	public double obtenerMinimaTemperatura() {
		double minima=temperatura[0];
		for (double d : temperatura) {
			if(d<minima) {
				minima=d;
			}
		}
		return minima;
	}
	
	
}
