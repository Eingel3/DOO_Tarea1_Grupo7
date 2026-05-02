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
        try {
        Producto comprado = refExp.comprarProducto(productoID, pago); 

        //Si la linea de arriba no lanzo excepciones, podemos entregar el vuelto y consumir el Producto comprado

        consumido = comprado.consumir();

        Moneda temp = refExp.getVuelto();
        while (temp != null){ //Mientras se sigan obteniendo monedas
        	vuelto = vuelto + temp.getValor();
        	temp = refExp.getVuelto();
        }
        }
        catch (PagoIncorrectoException e){// No se devuelve nada, vuelt es 0 y producto null
        	System.out.println("Pago incorrecto: " + e.getMessage()); //e.getMessage() obtiene como String el mesnaje del exception
        	consumido = "No se ha consumido nada.";
        }
        catch (PagoInsuficienteException e ){ //solo se devuelve la misma moneda con la que se intento pagar
        	System.out.println("Pago insuficiente: " + e.getMessage());
        	consumido = "No se ha consumido nada.";
        	vuelto = expRef.getVuelto().getValor(); //A la moneda obtenida del vuelto le obtenemos el valor y guardamos dicho valor en vuelo
        }
        catch (NoHayProductoException e){ //solo se devuelve la misma moneda con la que se intento pagar
        	System.out.println("No hay existencias del producto: " + e.getMessage());
        	consumido = "No se ha consumido nada.";
        	vuelto = expRef.getVuelto().getValor();
        }

	}

	public int compradorVuelto(){
		return vuelto;
	}

	public String compradorConsumido(){
		return consumido;
	}
}
