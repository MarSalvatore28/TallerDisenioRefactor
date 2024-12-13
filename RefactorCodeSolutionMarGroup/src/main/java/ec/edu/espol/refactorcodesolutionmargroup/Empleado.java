package ec.edu.espol.refactorcodesolutionmargroup;

public abstract class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public double calcularSalario(){
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }

        double salarioTotal = salarioBase;

        // Pago de horas extra
        if (horasTrabajadas > 40) {
            salarioTotal += (horasTrabajadas - 40) * 50;
        }

        // Calcular el salario adicional basado en el departamento
        salarioTotal += calcularSalarioAdicional();
        return salarioTotal;
    };
    public abstract double calcularSalarioAdicional();

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    // Más metodos

}
