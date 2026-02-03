import java.util.Scanner;

class Pedido {
    static int id_pedido = 0;
    String plato;
    double precio;
    int cantidad;
    String nombre_cliente;

    public Pedido(String plato, double precio, int cantidad) {
        this.id_pedido++;
        this.plato = plato;
        this.precio = precio;
        this.cantidad = cantidad;

    }
}

enum Estado_del_pedido {
    En_preparacion,
    Listo_para_entregar,
    Entregado
}

public class App {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Paella", 10.0, 1);
        Pedido pedido2 = new Pedido("Pasta", 12.0, 2);
        Pedido pedido3 = new Pedido("Pizza", 15.0, 3);
        Pedido pedido4 = new Pedido("Ensalada", 8.0, 4);

        Scanner sc = new Scanner(System.in);

    }
}