package comparador.supermercado;

public class ProductoPorPeso extends Producto {

	private String unidadDeVenta;
	
	public ProductoPorPeso(String nombre, int precio, String unidad) {
		super(nombre,precio);
		this.unidadDeVenta = unidad;
	}
	
	public String toString() {
		String detalles = "Nombre: " + nombre + " /// Precio: " + precio + " /// Unidad de venta: " + unidadDeVenta; 
		return detalles;
	}

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

}
