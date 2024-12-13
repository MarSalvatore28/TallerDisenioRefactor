package ec.edu.espol.refactorcodesolutionmargroup;

public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Bono Anual: " + bonoAnual);
        System.out.println("Género: " + genero);
    }
   
    

    // Más metodos

    @Override
    public double calcularSalarioAdicional() {
        return getHorasTrabajadas() > 40 ? (getHorasTrabajadas() - 40) * 50 : 0; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
