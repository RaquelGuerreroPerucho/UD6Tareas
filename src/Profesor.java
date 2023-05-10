import java.util.List;
public class Profesor extends Persona{
    String nombre;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String str, int edad){
        super(numeroDeTelefono);
        this.nombre= nombre;
        this.edad = edad;
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + nombre + System.lineSeparator()
                + "Edad: " + edad + System.lineSeparator()
                + "Teléfono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        for (Prestamo p:prestamos) {
            System.out.println(p);
        }
    }
}
