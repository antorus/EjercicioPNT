package comparador.supermercado;

public class ProductoConContenido extends Producto {
	
	private int contenido;

	public ProductoConContenido(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}
	
	public String toString() {
		String detalles = "Nombre: " + nombre + " /// Contenido: " + contenido + "ml" + " /// Precio: " + precio; 
		return detalles;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

}
