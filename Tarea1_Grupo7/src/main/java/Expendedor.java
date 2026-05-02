public class Expendedor {
	private Deposito<Fanta> fanta;
	private Deposito<CocaCola> coca;
	private Deposito<Snicker> snicker;
	private Deposito<Super8> super8;
	private Deposito<Sprite> sprite;

    private Deposito<Moneda> monedaDeposito;

    private int vuelto;

	public Expendedor(int cantidad){
		coca = new Deposito<CocaCola>();
        sprite = new Deposito<Sprite>();
        fanta = new Deposito<Fanta>();
        snicker= new Deposito<Snicker>();
        super8 = new Deposito<Super8>();

        monedaDeposito = new Deposito<Moneda>();
        
        for (int i = 0; i<cantidad; i++){
            Bebida temp = new CocaCola(1100+i);
            coca.addObjeto(temp);
        }
        for (int i = 0; i<cantidad; i++){
            Bebida temp = new Sprite(1200+i);
            sprite.addObjeto(temp);
        }
        for (int i = 0; i<cantidad; i++){
            Bebida temp = new Fanta(1300+i);
            coca.addObjeto(temp);
        }
        for (int i = 0; i<cantidad; i++){
            Dulce temp = new Super8(2100+i);  
            sprite.addObjeto(temp);
        }   
        for (int i = 0; i<cantidad; i++){
            Dulce temp = new Snicker(2200+i);
            sprite.addObjeto(temp);
        }         

	}

    public Producto comprarProducto(int tipo, Moneda pago) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        if (pago == null){
            throw new PagoIncorrectoException();}

    switch (tipo) {
    case SPRITE.getTipo:
        if (pago.getValor()<SPRITE.getPrecio()){
            monedaDeposito.addObjeto(pago); //El vuelto
            return null;
        }
        else {
            vuelto = pago.getValor() - SPRITE.getPrecio();
            //Para obtener el objeto, hemos de ver la excepcion NoHayProductoExcepcion
            // Por ahora este metodo no es funcional, hasta que manejemos las excepciones

        }
        break; //Del caso sprite
    }//end switch


    //Lo siguiente es para manejar el vuelto
    for (int i = 0; i < vuelto/100; i++){
        monedaDeposito.addObjeto(new Moneda100());
        }


    }

    public Moneda getVuelto(){
        if (monedaDeposito.isEmpty()){
            return null;
        }
        else{
        return monedaDeposito.getObjeto();
        }
    }

    class NoHayProductoException extends Exception {
        public NoHayProductoException(String mensajeError0){
            super(mensajeError0);
        }
    }
    class PagoIncorrectoException extends Exception {
        public PagoIncorrectoException(){
            super("La moneda con la que desea pagar es incorrecta. Pague con una moneda valida.");
        }
    }
    class PagoInsuficienteException extends Exception {
        public PagoInsuficienteException(String mensajeError){ 
        super(mensajeError);
        }
    }

}
