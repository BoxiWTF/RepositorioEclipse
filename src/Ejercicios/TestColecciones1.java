package Ejercicios;


public class TestColecciones1 {

	public static void main(String[] args) {
		double[] arrayDoubles = {1,2,3,4,5,6,7,8,9,10,11,12};
		Colecciones1 c1 = new Colecciones1(arrayDoubles);
		System.out.println(c1);
		//Apartado 1
		c1.getArrayDoubles()[arrayDoubles.length-1] = 5;
		System.out.println(c1);
		//Apartado 2
		for(int i=0;i<arrayDoubles.length-1;i++) {
			if(i==0) {
				c1.getArrayDoubles()[i]=3;
			}else {
				c1.getArrayDoubles()[i]=c1.getArrayDoubles()[i-1]*2; 
			}
		}
		System.out.println(c1);
		//Apartado 3
		double suma=0;
		for(int i=0;i<arrayDoubles.length-1;i++) {
			suma+=c1.getArrayDoubles()[i];
		}
		System.out.println("La suma de todos los elementos del array es: "+suma);
		//Apartado 4
		for(int i=arrayDoubles.length-5;i<arrayDoubles.length;i++) {
			c1.getArrayDoubles()[i] = c1.getArrayDoubles()[i]/3;
		}
		System.out.println(c1);
		//Apartado 5
		
	}

}
