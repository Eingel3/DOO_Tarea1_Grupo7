public class Sprite extends Bebida { //Falta extends
	public Sprite (int serie){
		super(serie);
	}

	@Override
	public String consumir(){
        return "sprite";
    }
}