package ec.edu.espol.refactorcodesolutionmargroup;

public class EmpleadoPorHoras extends Empleado {
    private String genero;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tarifa por Hora: " + tarifaHora);
        System.out.println("Género: " + genero);
    }

   

    // Más metodos

    @Override
    public double calcularSalarioAdicional() {
        return getHorasTrabajadas() * tarifaHora; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
