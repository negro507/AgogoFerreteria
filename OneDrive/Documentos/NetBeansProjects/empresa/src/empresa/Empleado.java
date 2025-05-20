package empresa;

import javax.swing.JOptionPane;

public class Empleado extends Empresa{
    private static Empleado VecEmp[];
    private static int n;

    public static void main(String[] args) {
        
        menu(); 
    }
    

    public static void menu(){
        int opcion;
        while(true){
            
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Que operacion desea realizar"
                     + " \n1.Registrar Empleado\n2.Mostrar nomina\n3.Mostar salario Promedio\n4Salario mayor\n5.Eliminar un empleado\n6.Salir"));
             
             switch(opcion){
                 case 1 ->{
                     ingresarEmpleado();
                     break;
                 }
                 
                 case 2 ->{
                     if(validarDatos()){
                         nomina();
                         break;
                     }  
                 }
                 
                 case 3 ->{
                     if(validarDatos()){
                         salarioProm();
                         Consola.imprimirLn("El promedio del salario es:"+salarioProm());
                         break;
                     }
                 }
                 
                 case 4 ->{
                     if(validarDatos()){
                         SalarioMayor();
                         break;
                     }
                 
                 }
                 
                 case 5 ->{
                     if(validarDatos()){
                         eliminarEmpleado();
                         break;               
                     } 
                 }
                 
                 case 6 ->{
                     System.out.println("Gracias por usar nuestro programa");
                     System.exit(0);
                 } 
                 default ->{
                     JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta");
                 }
             }
        }  
    }
    
    //--------------------------------------------------------------------------------------------------------------------------//
    public static void ingresarEmpleado(){
        
        
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
       
        
        // Bidimensional el arreglo
        VecEmp = new Empleado[n];
        
       for(int i=0; i<n; i++){
           VecEmp[i] = new Empleado();
               VecEmp[i].setNom(JOptionPane.showInputDialog("Ingrese el nombre del empleado"));
               VecEmp[i].setNht(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas trabajadas")));
               VecEmp[i].setCostoHora(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la hora")));
       }
    }
    
    //---------------------------------------------------------------------------------------------------------------------------//
    public static boolean nombresRepetidos(){
        for(int i=0; i<n; i++){
            if(VecEmp[i].getNom()==VecEmp[i].getNom()){
                JOptionPane.showMessageDialog(null, "No se permiten nombres repetidos");
                return false;
            }          
        }
        return true;
    }
        
    
    //---------------------------------------------------------------------------------------------------------------------------//
    
    
    public static void nomina(){
        Consola.imprimirLn("\nNOMINA DE LA EMPRESA  ");
        Consola.imprimirLn("NOMBRE\tSALARIO");
        
        for(int i=0; i<n; i++){
            if(VecEmp[i] !=null)
            System.out.println((i + 1) + " " + VecEmp[i].getNom() + " " + VecEmp[i].calcularSalario());
        
        } 
       
       }
    
    //--------------------------------------------------------------------------------------------------------------------------//
    public static double salarioProm(){
        double sueldoProm=0,sumaSalario=0;

        for(int i=0; i<n; i++){
            sumaSalario+=VecEmp[i].calcularSalario();
        }
        sueldoProm = sumaSalario/n;
        return sueldoProm;
    }
    
    //------------------------------------------------------------------------------------------------------------------------//
    public static void SalarioMayor(){
        double SalarioMayor=0;
        String nombreEmpleado = "";
        
        for(int i=0; i<n; i++){
            double salario = VecEmp[i].calcularSalario();
            if(salario>SalarioMayor){
                SalarioMayor = salario;
                nombreEmpleado = VecEmp[i].getNom();  
            }
        }
        
        Consola.imprimirLn("El salario mas alto es: "+SalarioMayor+" El empleado que lo devenga es: "+nombreEmpleado
        );
    }
    
    //------------------------------------------------------------------------------------------------------------------------//
    
    public static void eliminarEmpleado(){
        int objetoE = Integer.parseInt(JOptionPane.showInputDialog("Que empleado quieres eliminar"));
        
        for(int i=0; i<n; i++){
            VecEmp[objetoE] = null;
        
        }
    }
    
    //-----------------------------------------------------------------------------------------------------------------------------//
    public static boolean validarDatos(){
        if(VecEmp == null || VecEmp.length == 0){
            JOptionPane.showMessageDialog(null,"Los datos no han sido registrados en el vector");
            return false;
            
        }else{
            return true;
        
        }
    }   
    //------------------------------------------------------------------------------------------------------------------------------//
    
    
    
}
