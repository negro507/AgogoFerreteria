
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rbotero
 */
public class Consola {
     //Crear un objeto de la clase Scanner asociado al dispositivo de entrada teclado
   static Scanner sc = new Scanner(System.in);
   //--------------------------------------------------------------------------------------------------------
   //Método para leer un número entero
   public static int leerEntero() {
        int num = 0;

        try {
            num = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: sólo se admiten dígitos - "+ e);
            num = Integer.MAX_VALUE;
        }
        return num;
   }
    //--------------------------------------------------------------------------------------------------------
   //Método para leer un número real
   public static double leerReal () {
        double num = 0;
        try {
            num = sc.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Error: "+ e);
            num = Double.MAX_VALUE;
        }
        return num;
   }
   //--------------------------------------------------------------------------------------------------------
   //Método para leer un carácter
   public static char leerCaracter() {
        char car = '0';

        try {
            car = sc.next().charAt(0);
        }
        catch (InputMismatchException e){
            System.out.println("Error: "+ e);
            car = Character.MIN_LOW_SURROGATE;
        }
        return car;
   }
    //--------------------------------------------------------------------------------------------------------
   //Metodo para leer cadenas de texto
   public static String leerTexto () {
        String texto = "";
        try {
            texto = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Error: "+ e);
            texto = "";
        }
        return texto;
   }
   //--------------------------------------------------------------------------------------------------------
   //Metodos para imprimir datos
   public static void imprimirLn (String texto){
        //Salida con salto de línea
        System.out.println(texto);
   }
   public static void imprimir (String texto){
        //Salida sin salto de línea
        System.out.print(texto);
   }
}
