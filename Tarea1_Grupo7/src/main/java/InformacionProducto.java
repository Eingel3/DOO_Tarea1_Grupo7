public enum InformacionProducto {
	SPRITE(500, 11), //SPRITE llama a su constructor mediante 500
	COCACOLA(500, 12), //los tipos de las bebidas empiezan por 1, los dulces por 2
	SNICKER(100, 21), //el segundo numero diferencia el tip de bebida o dulce
	SUPER8(100, 22),
	FANTA(500, 13);
	private final int precio; //Todos los precios han de ser multiplos de 100, ya que todas las monedas son multiplo de 100
	private final int tipo;
	private PrecioProducto(int precio, int tipo) {
		this.precio = precio;
		this.tipo = tipo;
		}

	public int getPrecio(){
		return precio;
	}

	public int getTipo(){
		return tipo;
	}
}