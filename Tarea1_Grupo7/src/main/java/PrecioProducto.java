public enum PrecioProducto {
	SPRITE(500), //SPRITE llama a su constructor mediante 500
	COCACOLA(500),
	SNICKER(100),
	SUPER8(100),
	FANTA(500);
	private final int precio;

	private PrecioProducto(int precio) {
		this.precio = precio;
		}
}