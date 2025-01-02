import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemasNumericosScanner {
    //hexa, binario, octal
    public static void main(String[] args) {
        //abre el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");

        int entero = 0;
        //intentamos
        try {
            entero = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El numero ingresado no es entero");
            main(args);
            //para salir
            System.exit(0);
        }
        System.out.println("Entero decimal = " + entero);

        //binario
        // entero(10) <--> bytecode (jvm) <--> binario
        String resultadoBinario = ("Binario de: " + entero + ", es:" + Integer.toBinaryString(entero));

        //octal
        String resultadoOctal = "Octal de " + entero + ", es: " + Integer.toOctalString(entero);

        //hexadecimal
        String resultadoHexadecimal = ("Hexadecimal de " + entero + ", es: " + Integer.toHexString(entero));

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}
