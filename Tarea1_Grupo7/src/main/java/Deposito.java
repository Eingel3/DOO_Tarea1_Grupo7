public class Deposito<T>{
	private ArrayList<T> almacen; //almacen es de tipo generico

	public Deposito(){
		almacen = new ArrayList<>();
	}
	public void addObjeto(T objeto){ //Obtenemos un objeto generico
		almacen.add(objeto); //Se agrega el objeto generico, ya sea Moneda, Bebida o Dulce		
	}
}