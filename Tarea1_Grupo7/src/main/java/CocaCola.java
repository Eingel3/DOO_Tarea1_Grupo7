public class CocaCola extends Bebida {
	public CocaCola (int serie){
		super(serie);
	}
	@Override
	public String consumir(){
        return "coca-cola";
    }
}