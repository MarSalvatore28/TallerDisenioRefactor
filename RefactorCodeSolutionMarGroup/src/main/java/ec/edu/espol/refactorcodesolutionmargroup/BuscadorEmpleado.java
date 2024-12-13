package ec.edu.espol.refactorcodesolutionmargroup;

import java.util.List;
import java.util.Optional;

public class BuscadorEmpleado {
      public static Optional<Empleado> buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        return empleados.stream()
                .filter(empleado -> empleado.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }

    // Más metodos

}
