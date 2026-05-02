import java.util.ArrayList;

public class Deposito<T>{
	private ArrayList<T> almacen; //almacen es de tipo generico

	public Deposito(){
		almacen = new ArrayList<>();
	}
	public void addObjeto(T objeto){ //Obtenemos un objeto generico
		almacen.add(objeto); //Se agrega el objeto generico, ya sea Moneda, Bebida o Dulce		
	}

	public T getObjeto() { //Retorna una Moneda o Bebida o Dulce
        if (almacen.size()==0) { //Si el almacen no tiene objetos, retornamos null
            return null;
        }
        return almacen.remove(0); //Si tiene un objeto, removemos el objeto del almacen y lo retornamos
    }
}