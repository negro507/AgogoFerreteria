
import javax.swing.JOptionPane;

public class Arreglo {
    private static int vec[];//Declarar el arreglo
       public static void main(String[] args) {
           final String CYAN = "\u001B[36m";
           final String RESET = "\u001B[0m";
           boolean sw = false; //El vector está vacío
           int opcion;
           do{
               Consola.imprimirLn("\t\t\t\tMENU");
               Consola.imprimirLn("1. LLenar el vector con números aleatorios");
               Consola.imprimirLn("2. Mostrar el vector");
               Consola.imprimirLn("3. Buscar un elemento");
               Consola.imprimirLn("4. Mostrar la cantidad de veces que se repite cada dato");
               Consola.imprimirLn("5. Eliminar un dato");
               Consola.imprimirLn("6. Finalizar");
               Consola.imprimirLn("¿Cual es su opción? ");
               opcion = Consola.leerEntero();
               
               if (opcion <=0 || opcion >5)
                   Consola.imprimirLn(CYAN + "\tError: opcion inválida");
               else{
                    switch (opcion){
                        case 1 -> {
                            llenarVector();
                            sw = true;
                            Consola.imprimirLn(CYAN + "\tEl vector ha sido llenado con números aleatorios entre 1 y 10");
                        }
                        case 2 -> {
                            if (!sw)
                                Consola.imprimirLn(CYAN + "\tNo hay datos");
                            else
                                mostrarVector();
                        }
                        case 3 -> {
                            if (!sw)
                                Consola.imprimirLn(CYAN + "\tNo hay datos");
                            else{
                                Consola.imprimirLn("Ingrese el dato a buscar:");
                                int dato = Consola.leerEntero();
                                int pos = busquedaSecuencial(dato);
                                if (pos == -1)
                                    Consola.imprimirLn(CYAN + dato + " no existe");
                                else
                                    Consola.imprimirLn(CYAN + dato + " hallado por primera vez en posición " + pos);
                            }
                        }
                        
                        case 4 ->{
                            if (!sw)
                                Consola.imprimirLn(CYAN + "\tNo hay datos");
                            else{
                                int contador[] = contarRepetidos();
                                Consola.imprimirLn("contadores por dato");
                                for(int i=0; i<contador.length; i++){
                                    Consola.imprimirLn((i+1)+":"+contador[i]);
                                }
                            }
                        }
                        
                        case 5 ->{
                            if(!sw)
                                Consola.imprimirLn(CYAN + "\tNo hay datos");
                            else{
                            
                            }
                        }
                    }
               }
               Consola.imprimirLn("-----------------------------------------------------------------");
        } while (opcion != 6);
    }
    //----------------------------------------
    public static void llenarVector() {
       vec = new int[100];
       for (int i=0; i<vec.length; i++){
           vec[i]= (int)(Math.random()*10+1);
       }
    }
    //----------------------------------------
    public static void mostrarVector() {
       for (int i=0; i<vec.length; i++){
           System.out.print(vec[i]+"  ");
       }
       Consola.imprimirLn("");
    }
    //----------------------------------------
    public static int busquedaSecuencial(int x) {
        int posicion = -1;//El dato no existe
        int i = 0; // Para recorrer el vector
        while (i < vec.length && posicion == -1){
            if (vec[i] == x)
                posicion = i;
            else
                i++;
        }
        return posicion;
    }
    //----------------------------------------------------------------------//  
    //crear un vector vacio y despues crear otro ciclo que me recorra el vector anterior y me llene el vector vacio//
    public static int[] contarRepetidos() {
    int[] veces = new int[10];

    for (int i = 0; i < vec.length; i++) {
        switch (vec[i]) {
            case 1 ->{
                veces[0]++;
            }
            case 2 -> veces[1]++;
            case 3 -> veces[2]++;
            case 4 -> veces[3]++;
            case 5 -> veces[4]++;
            case 6 -> veces[5]++;
            case 7 -> veces[6]++;
            case 8 -> veces[7]++;
            case 9 -> veces[8]++;
            case 10 -> veces[9]++;
        }
    }
        return veces;
}
    
    public static void eliminarDato(int numeroEliminar){
        for(int i=0; i<vec.length; i++){
            if(vec[i] == numeroEliminar)
            vec[1] = 0;
        }
    }
}