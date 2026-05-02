public enum InformacionProducto {
	SPRITE(500), //SPRITE llama a su constructor mediante 500
	COCACOLA(500),
	SNICKER(100),
	SUPER8(100),
	FANTA(500);
	private final int precio; //Todos los precios han de ser multiplos de 100, ya que todas las monedas son multiplo de 100

	private PrecioProducto(int precio) {
		this.precio = precio;
		}

	public int getPrecio(){
		return precio;
	}
}