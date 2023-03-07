import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {


LocalDate fecha = LocalDate.of(2023,3,7);
        Persona persona = new Persona("Juan", 30,fecha);
        Persona persona1 = new Persona("Roberto", 50,fecha);
        Persona persona2 = new Persona("Cristian",75,fecha);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Jabón en polvo", 40));
        carrito.agregarProducto(new Producto("Esponjas", 10));
        carrito.agregarProducto(new Producto("Chocolates", 100));


        System.out.println("El precio total es: " + carrito.precio()); // debería imprimir

        System.out.println("Las personas que compraron fueron:"+persona.getNombre());

        System.out.println("La fecha de la compra fue:"+persona.getFecha());





    }
}

