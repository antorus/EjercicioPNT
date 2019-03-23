package comparador.supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparador {
	
	/*Resultado solicitado:
	
	Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

	Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

	Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

	Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

	=============================

	Producto más caro: Frutillas

	Producto más barato: Coca-Cola */

	public static void main(String[] args) {
		ProductoLiquido producto1 = new ProductoLiquido("Coca-Cola Zero", 20, 1.5);
		ProductoLiquido producto2 = new ProductoLiquido("Coca-Cola", 18, 1.5);
		ProductoConContenido producto3 = new ProductoConContenido("Shampoo Sedal", 19, 500);
		ProductoPorPeso producto4 = new ProductoPorPeso("Frutillas",  64, "kilo");
		
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(producto1);
		listaDeProductos.add(producto2);
		listaDeProductos.add(producto3);
		listaDeProductos.add(producto4);
		
		Collections.sort(listaDeProductos);
		
		System.out.println(producto1.toString());
		System.out.println(producto2.toString());
		System.out.println(producto3.toString());
		System.out.println(producto4.toString());

		System.out.println("=============================");
		System.out.println("Producto más caro: " + ((listaDeProductos.get(listaDeProductos.size()-1)).getNombre()));
		System.out.println("Producto más barato: " + ((listaDeProductos.get(0)).getNombre()));
		
	}
}
