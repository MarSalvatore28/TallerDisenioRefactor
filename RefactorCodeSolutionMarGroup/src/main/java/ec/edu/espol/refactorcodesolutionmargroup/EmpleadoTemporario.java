package ec.edu.espol.refactorcodesolutionmargroup;

public class EmpleadoTemporario extends Empleado {

    private int mesesContrato;
    private String genero;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de Contrato: " + mesesContrato);
        System.out.println("Género: " + genero);
    }
    // Más metodos

    @Override
    public double calcularSalarioAdicional() {
        return getHorasTrabajadas() > 40 ? (getHorasTrabajadas() - 40) * 50 : 0; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
