public class Expendedor {
	private Deposito<Fanta> fanta;
	private Deposito<CocaCola> coca;
	private Deposito<Snicker> snicker;
	private Deposito<Super8> super8;
	private Deposito<Sprite> sprite;

	public Expendedor(int cantidad){
		coca = new Deposito<CocaCola>();
        sprite = new Deposito<Sprite>();
        fanta = new Deposito<Fanta>();
        snicker= new Deposito<Snicker>();
        super8 = new Deposito<Super8>();
        
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
            Dulce temp = new Super8(200+i);
            sprite.addObjeto(temp);
        }   
        for (int i = 0; i<cantidad; i++){
            Dulce temp = new Snicker(200+i);
            sprite.addObjeto(temp);
        }         

	}
}
