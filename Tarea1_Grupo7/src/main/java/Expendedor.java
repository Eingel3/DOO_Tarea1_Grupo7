public class Expendedor {
	private Deposito<Fanta> fanta;
	private Deposito<CocaCola> coca;
	private Deposito<Snicker> snicker;
	private Deposito<Super8> super8;
	private Deposito<Sprite> sprite;

    private Deposito<Moneda> monedaDeposito;

    private int vuelto;
    private Producto compra; 


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
            fanta.addObjeto(temp);
        }
        for (int i = 0; i<cantidad; i++){
            Dulce temp = new Super8(2100+i);  
            super8.addObjeto(temp);
        }   
        for (int i = 0; i<cantidad; i++){
            Dulce temp = new Snicker(2200+i);
            snicker.addObjeto(temp);
        }         

	}

    public Producto comprarProducto(int tipo, Moneda pago) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        if (pago == null){
            throw new PagoIncorrectoException();}

    switch (tipo) {
    case 11:
        if (pago.getValor() < SPRITE.getPrecio()){
            monedaDeposito.addObjeto(pago); //El vuelto
            throw new PagoInsuficienteException("La moneda tiene un valor de " + pago.getValor() + 
                " lo cual es insuficiente, debe de tener un valor de al menos " + SPRITE.getPrecio());
        }
        else {
            vuelto = pago.getValor() - SPRITE.getPrecio();
            //Para obtener el objeto, hemos de ver la excepcion NoHayProductoExcepcion
            if (sprite.isEmpty()) {
                throw new NoHayProductoException("No quedan sprites");
            }
            else { //Quedan productos, entonces compramos un producto
                compra = sprite.getObjeto();
            }
        }
        break; //Del caso sprite

            case 13:
        if (pago.getValor() < FANTA.getPrecio()){
            monedaDeposito.addObjeto(pago); //El vuelto
            throw new PagoInsuficienteException("La moneda tiene un valor de " + pago.getValor() + 
                " lo cual es insuficiente, debe de tener un valor de al menos " + FANTA.getPrecio());
        }
        else {
            vuelto = pago.getValor() - FANTA.getPrecio();
            //Para obtener el objeto, hemos de ver la excepcion NoHayProductoExcepcion
            if (fanta.isEmpty()) {
                throw new NoHayProductoException("No quedan fantas");
            }
            else { //Quedan productos, entonces compramos un producto
                compra = fanta.getObjeto();
            }
        }
        break;


            case 12:
        if (pago.getValor() < COCACOLA.getPrecio()){
            monedaDeposito.addObjeto(pago); //El vuelto
            throw new PagoInsuficienteException("La moneda tiene un valor de " + pago.getValor() + 
                " lo cual es insuficiente, debe de tener un valor de al menos " + COCACOLA.getPrecio());
        }
        else {
            vuelto = pago.getValor() - COCACOLA.getPrecio();
            //Para obtener el objeto, hemos de ver la excepcion NoHayProductoExcepcion
            if (coca.isEmpty()) {
                throw new NoHayProductoException("No quedan cocacolas");
            }
            else { //Quedan productos, entonces compramos un producto
                compra = coca.getObjeto();
            }
        }
        break;


            case 21:
        if (pago.getValor() < SNICKER.getPrecio()){
            monedaDeposito.addObjeto(pago); //El vuelto
            throw new PagoInsuficienteException("La moneda tiene un valor de " + pago.getValor() + 
                " lo cual es insuficiente, debe de tener un valor de al menos " + SNICKER.getPrecio());
        }
        else {
            vuelto = pago.getValor() - SNICKER.getPrecio();
            //Para obtener el objeto, hemos de ver la excepcion NoHayProductoExcepcion
            if (snicker.isEmpty()) {
                throw new NoHayProductoException("No quedan snickers");
            }
            else { //Quedan productos, entonces compramos un producto
                compra = snicker.getObjeto();
            }
        }
        break;



            case 22:
        if (pago.getValor() < SUPER8.getPrecio()){
            monedaDeposito.addObjeto(pago); //El vuelto
            throw new PagoInsuficienteException("La moneda tiene un valor de " + pago.getValor() + 
                " lo cual es insuficiente, debe de tener un valor de al menos " + SUPER8.getPrecio());
        }
        else {
            vuelto = pago.getValor() - SUPER8.getPrecio();
            //Para obtener el objeto, hemos de ver la excepcion NoHayProductoExcepcion
            if (super8.isEmpty()) {
                throw new NoHayProductoException("No quedan super8");
            }
            else { //Quedan productos, entonces compramos un producto
                compra = super8.getObjeto();
            }
        }
        break;
    }//end switch


    //Lo siguiente es para manejar el vuelto
    for (int i = 0; i < vuelto/100; i++){
        monedaDeposito.addObjeto(new Moneda100());
        }

    return compra; //Finalmente retornamos el Producto comprado

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
