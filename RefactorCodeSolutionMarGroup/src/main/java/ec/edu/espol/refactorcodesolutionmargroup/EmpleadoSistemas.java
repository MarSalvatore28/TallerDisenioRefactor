package ec.edu.espol.refactorcodesolutionmargroup;

public class EmpleadoSistemas extends Empleado {

    public EmpleadoSistemas(String nombre, double salarioBase, int horasTrabajadas, String departamento) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
    }

    @Override
    public double calcularSalarioAdicional() {
        return 20; // Bonus para el departamento de Sistemas
    }
}
