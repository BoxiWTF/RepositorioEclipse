package teoria;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		//creamos la lista vacia
		List<String> listaCadenas = new ArrayList<String>();
		System.out.printf("Tamaño de la lista %d%n",listaCadenas.size());
		listaCadenas.add("joaquin");
		listaCadenas.add("fernando");
		listaCadenas.add("luis");
		System.out.printf("Tamaño de la lista %d%n",listaCadenas.size());
		System.out.printf("Primer elemento de la lista es %s%n",listaCadenas.get(0));
		System.out.printf("Ultimo elemento de la lista es %s%n",listaCadenas.get(listaCadenas.size()-1));
		System.out.printf("%s%n",listaCadenas);
		listaCadenas.add(0, "rigoberto");
		System.out.printf("%s%n",listaCadenas);
		listaCadenas.remove(0);
		System.out.printf("%s%n",listaCadenas);
		listaCadenas.remove("luis");
		System.out.printf("%s%n",listaCadenas);
		//recorremos la lista
		for (String string : listaCadenas) {
			System.out.println(string);
		}
	}

}
