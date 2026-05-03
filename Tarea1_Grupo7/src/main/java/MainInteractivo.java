import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Expendedor exp = new Expendedor(3); // 3 unidades de cada producto
        System.out.println("Bienvenid@");
        System.out.println("Productos disponibles:");
        System.out.println(" - Bebidas: 11-Sprite, 12-CocaCola, 13-Fanta (precio 500)");
        System.out.println(" - Dulces:  21-Snicker, 22-Super8 (precio 500)");
        System.out.println("Monedas válidas: 100, 500, 1000");
        System.out.println("Escriba un numero negativo para salir, NO ESCRIBA NADA QUE NO SEA UN ENTERO.\n");
        String entrada;
        boolean a = true;
        while (a) {
            System.out.print("Ingrese código de producto (11-13, 21-22): ");
            entrada = sc.nextLine().trim();
            int codigo;
            codigo = Integer.parseInt(entrada);
            if(codigo< 0){a = false;}
            else {
                System.out.print("Ingrese valor de la moneda (100, 500, 1000): ");
                int valorMoneda;
                valorMoneda = sc.nextInt();
                sc.nextLine();
                if(valorMoneda< 0){a = false;}
                else {
                    Moneda m = null;
                    switch (valorMoneda) {
                        case 100:
                            m = new Moneda100();
                            break;
                        case 500:
                            m = new Moneda500();
                            break;
                        case 1000:
                            m = new Moneda1000();
                            break;
                        default:
                            System.out.println("Moneda no válida.\n");
                    }

                    Comprador c = new Comprador(m, codigo, exp);
                    System.out.println("Consumido: " + c.compradorConsumido());
                    System.out.println("Vuelto: " + c.compradorVuelto());
                }
            }
        }
        System.out.println("Gracias por visitar nuestro expendedor.");
    }
}