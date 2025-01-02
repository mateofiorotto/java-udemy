public class PrimitivosCaracteres {
    public static void main(String[] args) {

        //Solo 1 caracter, no más, para char utilizar ' ', para string " "
        char caracter = 'A';
        System.out.println("caracter = " + caracter);

        char charUnicode = '\u0040';
        System.out.println("charUnicode = " + charUnicode);

        char decimal = 64;
        System.out.println("decimal = " + decimal);

        //prioridad a la operación, luego a la concatenación
        System.out.println("Es decimal = caracterUnicode ?: " + (decimal == charUnicode));

        char simboloDirecto = '$';
        System.out.println("simboloDirecto = " + simboloDirecto);

        //Clase char:
        System.out.println("Char en Byte: " + Character.BYTES);
        System.out.println("Char en Bites: " + Character.SIZE);
        System.out.println("Char MAX: " + Character.MAX_VALUE);
        System.out.println("Char MIN: " + Character.MIN_VALUE);

        // PRIMITIVOS CARACTERES ESPECIALES
        char espacio = ' '; // o '\u0020'
        char retroceso = '\b'; //backspace
        char tabulador = '\t'; //tabulador
        char saltoLinea = '\n'; //salto de linea

        //atajo salto de linea con el metodo System.lineSeparator()
        System.out.println("Char en byte: " + System.lineSeparator() + Character.BYTES);
    }
}
