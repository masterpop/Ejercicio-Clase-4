import java.security.PrivateKey;
import java.security.PublicKey;
import java.time.LocalDate;

public class Persona
{

    private String nombre;
    private int edad;

    private LocalDate fecha;

    public Persona(String nombre, int edad , LocalDate fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
    }




    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

