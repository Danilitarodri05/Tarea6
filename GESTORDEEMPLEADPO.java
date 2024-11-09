import java.util.ArrayList;
import java.util.Scanner;

public class GestorEmpleados {

    private ArrayList<Empleado> listaEmpleados;

    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println("Empleado agregado con éxito.");
    }


    public void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : listaEmpleados) {
                emp.mostrarInformacion();
                System.out.println("---------------------------");
            }
        }
    }
}
