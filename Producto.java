package comparador.supermercado;

public class Producto implements Comparable<Producto> {
	
	protected String nombre;
	protected int precio;
	
	public Producto() {
	}
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public int compareTo(Producto otroProducto) {
		return (this.getPrecio() - otroProducto.getPrecio());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
