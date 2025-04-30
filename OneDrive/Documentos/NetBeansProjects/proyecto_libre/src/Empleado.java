public class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(){}
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
    
    public void salarioTotal(double horas_trabajadas, double valor_hora){
        salario = horas_trabajadas*valor_hora;
    }   
}
