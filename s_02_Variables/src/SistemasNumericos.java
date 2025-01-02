import javax.swing.*;

public class SistemasNumericos {
    //hexa, binario, octal
    public static void main(String[] args) {
        //Abre una ventana para cargar el numero entero
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese Num entero: ");

        int entero = 0;
        //intentamos
        try {
            entero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un entero");
            main(args);
            //para salir
            System.exit(0);
        }
        System.out.println("Entero decimal = " + entero);

        //binario
        // entero(10) <--> bytecode (jvm) <--> binario
        String resultadoBinario = ("Binario de: " + entero + ", es:" + Integer.toBinaryString(entero));
        System.out.println(resultadoBinario);

        //con 0b java asume que es un binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //octal
        String resultadoOctal = "Octal de " + entero + ", es: " + Integer.toOctalString(entero);
        System.out.println(resultadoOctal);

        //con 0 al principio
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //hexadecimal
        String resultadoHexadecimal = ("Hexadecimal de " + entero + ", es: " + Integer.toHexString(entero));
        System.out.println(resultadoHexadecimal);

        //con 0x (puede ser en mayus o minusc)
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
