import java.time.LocalDate;

public class Producto {

    private String nombre;
    private double precioUnitario;

    public Producto(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }
}
