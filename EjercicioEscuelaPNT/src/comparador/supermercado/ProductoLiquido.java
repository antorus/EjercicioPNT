package comparador.supermercado;

public class ProductoLiquido extends Producto {
	
	private double litros;

	public ProductoLiquido(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	public String toString() {
		String detalles = "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: " + precio;
		return detalles;
	}
	
	public double getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

}
