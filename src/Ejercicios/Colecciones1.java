package Ejercicios;

import java.util.Arrays;

public class Colecciones1 {
	//atributo
	private double[] arrayDoubles;
	//constructor
	public Colecciones1(double[] arrayDoubles) {
		this.arrayDoubles = arrayDoubles;
	}
	//metodos
	@Override
	public String toString() {
		return "El array contiene =" + Arrays.toString(arrayDoubles);
	}
	public double[] getArrayDoubles() {
		return arrayDoubles;
	}
	public void setArrayDoubles(double[] arrayDoubles) {
		this.arrayDoubles = arrayDoubles;
	}
	
	
}
