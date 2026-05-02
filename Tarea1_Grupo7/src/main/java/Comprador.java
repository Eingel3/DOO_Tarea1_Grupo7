public class Comprador{ //El comprador debe de recibir una moneda y el nombre del producto que se desea comprar
			//Luego, ha de intentar comprar el producto
			//Finalmente, devolver el vuelto correspondiente con Monedas100

	private String consumido; //que se ha consumido
	private int vuelto;
	
	public Comprador(Moneda pago, int productoID, Expendedor refExp){
		//Recibe una moneda, entero identificador del producto y una referencia a un Expendedor
		//Compra en el expendedor usando la moneda pago el producto productoID, ej: productoRecivido = refExp.Comprar(pago, productoID);
		//luego, si se consiguio un producto hay que consumirlo y registrar su sabor, ejemplo: sabos = productoRecibido.Consumir();
		//Luego recuperar la moneda del vuelto una a una
		//NO almacenar las monedas ni los productos como propiedad
		//Unicas propiedades: un string (sabor) y un entero 
        vuelto = 0;

	}
}
