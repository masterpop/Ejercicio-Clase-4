import javax.lang.model.element.ModuleElement;
import java.time.LocalDate;

public class Carrito

{
    private Producto[] productos = new Producto[3];
    private int cantidadProductos = 0;

    public void agregarProducto(Producto p) {
        if (cantidadProductos < 3) {
            productos[cantidadProductos] = p;
            cantidadProductos++;
        } else {
            System.out.println("No se pueden agregar más productos al carrito");
        }
    }

    public double precio() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getPrecioUnitario();
        }
        return total;

    }



}


