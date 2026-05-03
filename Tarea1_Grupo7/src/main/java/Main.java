import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Expendedor exp = new Expendedor(2);
		System.out.println("Expendedor con 2 de cada producto creado");
        System.out.println("Comprar Sprite con Moneda500, precio exacto: ");
        Comprador c = new Comprador(new Moneda500(), InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c.compradorConsumido());
        System.out.println("Vuelto: " + c.compradorVuelto());
        System.out.println("Comprar sprite, pero sin monedas");
        Comprador c3 = new Comprador(null, InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c3.compradorConsumido());
        System.out.println("Vuelto: " + c3.compradorVuelto());
        System.out.println("Comprar sprite, pero el dinero es menos de lo que cuesta");
        Comprador c4 = new Comprador(new Moneda100(), InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c4.compradorConsumido());
        System.out.println("Vuelto: " + c4.compradorVuelto());

        System.out.println("Comprar Sprite con pago de mas (500 de mas)");
        Comprador c1 = new Comprador(new Moneda1000(), InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c1.compradorConsumido());
        System.out.println("Vuelto: " + c1.compradorVuelto());
        System.out.println("Comprar sprite, pero ya se acabaron");
        Comprador c2 = new Comprador(new Moneda1000(), InformacionProducto.SPRITE.getTipo(), exp);
        System.out.println("Consumido: " + c2.compradorConsumido());
        System.out.println("Vuelto: " + c2.compradorVuelto());

        System.out.println("Ahora hacemos todo lo anterior con el resto de Productos");

        System.out.println("Comprar con precio exacto: ");
        Comprador c5 = new Comprador(new Moneda500(), InformacionProducto.FANTA.getTipo(), exp);
        System.out.println("Consumido: " + c5.compradorConsumido());
        System.out.println("Vuelto: " + c5.compradorVuelto());
        System.out.println("Comprar pero sin monedas");
        Comprador c7 = new Comprador(null, InformacionProducto.FANTA.getTipo(), exp);
        System.out.println("Consumido: " + c7.compradorConsumido());
        System.out.println("Vuelto: " + c7.compradorVuelto());
        System.out.println("Comprar pero el dinero es menos de lo que cuesta");
        Comprador c8 = new Comprador(new Moneda100(), InformacionProducto.FANTA.getTipo(), exp);
        System.out.println("Consumido: " + c8.compradorConsumido());
        System.out.println("Vuelto: " + c8.compradorVuelto());

        System.out.println("Comprar con pago de mas");
        Comprador c6 = new Comprador(new Moneda1000(), InformacionProducto.FANTA.getTipo(), exp);
        System.out.println("Consumido: " + c6.compradorConsumido());
        System.out.println("Vuelto: " + c6.compradorVuelto());
        System.out.println("Comprar pero ya se acabaron");
        Comprador c9 = new Comprador(new Moneda1000(), InformacionProducto.FANTA.getTipo(), exp);
        System.out.println("Consumido: " + c9.compradorConsumido());
        System.out.println("Vuelto: " + c9.compradorVuelto());

                //Lo de abajo fue hecho mediante ChatGPT, segun el codigo de arriba de main

            // ================== COCACOLA ==================
            System.out.println("Comprar con precio exacto:");
            Comprador c10 = new Comprador(new Moneda500(), InformacionProducto.COCACOLA.getTipo(), exp);
            System.out.println("Consumido: " + c10.compradorConsumido());
            System.out.println("Vuelto: " + c10.compradorVuelto());

            System.out.println("Comprar pero sin monedas");
            Comprador c11 = new Comprador(null, InformacionProducto.COCACOLA.getTipo(), exp);
            System.out.println("Consumido: " + c11.compradorConsumido());
            System.out.println("Vuelto: " + c11.compradorVuelto());

            System.out.println("Comprar pero el dinero es menos de lo que cuesta");
            Comprador c12 = new Comprador(new Moneda100(), InformacionProducto.COCACOLA.getTipo(), exp);
            System.out.println("Consumido: " + c12.compradorConsumido());
            System.out.println("Vuelto: " + c12.compradorVuelto());

            System.out.println("Comprar con pago de mas");
            Comprador c13 = new Comprador(new Moneda1000(), InformacionProducto.COCACOLA.getTipo(), exp);
            System.out.println("Consumido: " + c13.compradorConsumido());
            System.out.println("Vuelto: " + c13.compradorVuelto());

            System.out.println("Comprar pero ya se acabaron");
            Comprador c14 = new Comprador(new Moneda1000(), InformacionProducto.COCACOLA.getTipo(), exp);
            System.out.println("Consumido: " + c14.compradorConsumido());
            System.out.println("Vuelto: " + c14.compradorVuelto());


// ================== SNICKER ==================
            System.out.println("\nComprar con precio exacto:");
            Comprador c15 = new Comprador(new Moneda500(), InformacionProducto.SNICKER.getTipo(), exp);
            System.out.println("Consumido: " + c15.compradorConsumido());
            System.out.println("Vuelto: " + c15.compradorVuelto());

            System.out.println("Comprar pero sin monedas");
            Comprador c16 = new Comprador(null, InformacionProducto.SNICKER.getTipo(), exp);
            System.out.println("Consumido: " + c16.compradorConsumido());
            System.out.println("Vuelto: " + c16.compradorVuelto());

            System.out.println("Comprar pero el dinero es menos de lo que cuesta");
            Comprador c17 = new Comprador(new Moneda100(), InformacionProducto.SNICKER.getTipo(), exp);
            System.out.println("Consumido: " + c17.compradorConsumido());
            System.out.println("Vuelto: " + c17.compradorVuelto());

            System.out.println("Comprar con pago de mas");
            Comprador c18 = new Comprador(new Moneda1000(), InformacionProducto.SNICKER.getTipo(), exp);
            System.out.println("Consumido: " + c18.compradorConsumido());
            System.out.println("Vuelto: " + c18.compradorVuelto());

            System.out.println("Comprar pero ya se acabaron");
            Comprador c19 = new Comprador(new Moneda1000(), InformacionProducto.SNICKER.getTipo(), exp);
            System.out.println("Consumido: " + c19.compradorConsumido());
            System.out.println("Vuelto: " + c19.compradorVuelto());


// ================== SUPER8 ==================
            System.out.println("\nComprar con precio exacto:");
            Comprador c20 = new Comprador(new Moneda500(), InformacionProducto.SUPER8.getTipo(), exp);
            System.out.println("Consumido: " + c20.compradorConsumido());
            System.out.println("Vuelto: " + c20.compradorVuelto());

            System.out.println("Comprar pero sin monedas");
            Comprador c21 = new Comprador(null, InformacionProducto.SUPER8.getTipo(), exp);
            System.out.println("Consumido: " + c21.compradorConsumido());
            System.out.println("Vuelto: " + c21.compradorVuelto());

            System.out.println("Comprar pero el dinero es menos de lo que cuesta");
            Comprador c22 = new Comprador(new Moneda100(), InformacionProducto.SUPER8.getTipo(), exp);
            System.out.println("Consumido: " + c22.compradorConsumido());
            System.out.println("Vuelto: " + c22.compradorVuelto());

            System.out.println("Comprar con pago de mas");
            Comprador c23 = new Comprador(new Moneda1000(), InformacionProducto.SUPER8.getTipo(), exp);
            System.out.println("Consumido: " + c23.compradorConsumido());
            System.out.println("Vuelto: " + c23.compradorVuelto());

            System.out.println("Comprar pero ya se acabaron");
            Comprador c24 = new Comprador(new Moneda1000(), InformacionProducto.SUPER8.getTipo(), exp);
            System.out.println("Consumido: " + c24.compradorConsumido());
            System.out.println("Vuelto: " + c24.compradorVuelto());

            //Ahora vemos lo de las instrucciones de la tarea, mostrar el funcionamiento de comparable con monedas
        System.out.println("Prueba ordenar monedas mediante comparable");
        Moneda[] muchas = {new Moneda1000(), new Moneda100(), new Moneda500(), new Moneda100(), new Moneda1000()};

     }

}