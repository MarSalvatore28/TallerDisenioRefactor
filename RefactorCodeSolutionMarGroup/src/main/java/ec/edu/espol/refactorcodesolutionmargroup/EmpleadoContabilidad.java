package ec.edu.espol.refactorcodesolutionmargroup;

public class EmpleadoContabilidad extends Empleado {

    public EmpleadoContabilidad(String nombre, double salarioBase, int horasTrabajadas, String departamento) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
    }

    @Override
    public double calcularSalarioAdicional() {
        return 10; // Bonus para el departamento de Contabilidad
    }
}

