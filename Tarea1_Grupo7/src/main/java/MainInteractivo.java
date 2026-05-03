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
        System.out.println("Escriba 'salir' para terminar.\n");
        String entrada;
        while (true) {
            System.out.print("Ingrese código de producto (11-13, 21-22): ");
            entrada = sc.nextLine().trim();

        }
    }
}