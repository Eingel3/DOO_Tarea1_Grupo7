import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Expendedor exp = new Expendedor(2);
		System.out.println("Expendedor con 2 de cada producto creado");
        System.out.println("Comprar Sprite con Moneda500, precio exacto: ");
        Comprador c = new Comprador(new Moneda500(), InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c.compradorConsumido());
        System.out.println("Vuelto: " + c.compradorVuelto());

        System.out.println("Comprar Sprite con pago de mas (500 de mas)");
        Comprador c1 = new Comprador(new Moneda1000(), InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c1.compradorConsumido());
        System.out.println("Vuelto: " + c1.compradorVuelto());

        
    }

	
}
