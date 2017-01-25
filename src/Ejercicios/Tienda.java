package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> listaProductos;
	
	//constructor genera una lista vac�a
	public Tienda() {
		this.listaProductos = new ArrayList<Producto>();
	}
	//añadir producto
	public boolean insertarProducto(Producto p){
		return listaProductos.add(p);
	}
	//quitar el producto
	public boolean eliminarProducto(Producto p){
		return listaProductos.remove(p);
	}
	//get
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	//obtener el producto m�s caro 
	public Producto obtenerProductoMasCaro(){
		Producto productoMasCaro = listaProductos.get(0);
		for (Producto producto : listaProductos) {
			if (producto.getPrecioProducto() > productoMasCaro.getPrecioProducto()){
				productoMasCaro = producto;				
			}
		}
		return productoMasCaro;
	}
	//obtener el producto m�s barato 
	public Producto obtenerProductoMasBarato(){
		Producto productoMasBarato = listaProductos.get(0);
		for (Producto producto : listaProductos) {
			if (producto.getPrecioProducto() < productoMasBarato.getPrecioProducto()){
				productoMasBarato = producto;				
			}
		}
		return productoMasBarato;
	}
	@Override
	public String toString() {
		return "Tienda [listaProductos=" + listaProductos + "]";
	}
}
