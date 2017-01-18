package teoria;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listaEnteros = new ArrayList<Integer>();
		System.out.printf("Tamaño de la lista %d%n",listaEnteros.size());
		listaEnteros.add(8);
		listaEnteros.add(7);
		listaEnteros.add(25);
		System.out.printf("Tamaño de la lista %d%n",listaEnteros.size());
		System.out.printf("Primer elemento de la lista es %d%n",listaEnteros.get(0));
		System.out.printf("Ultimo elemento de la lista es %d%n",listaEnteros.get(listaEnteros.size()-1));
		System.out.printf("%s%n",listaEnteros);
		listaEnteros.add(0,125);
		System.out.printf("%s%n",listaEnteros);
		listaEnteros.remove(0);
		System.out.printf("%s%n",listaEnteros);
		listaEnteros.remove(new Integer(25));
		System.out.printf("%s%n",listaEnteros);
		//recorremos la lista
		for (Integer integer : listaEnteros) {
			if(integer%2==0)
				System.out.println(integer);
		}
		for (Integer integer2 : listaEnteros) {
			integer2=integer2*2;
			System.out.println(integer2);
		}
	}
}
