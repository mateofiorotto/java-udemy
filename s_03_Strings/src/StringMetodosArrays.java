public class StringMetodosArrays {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";

        //Hace un array de los caracteres del String
        //System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); --> imprime el registro
        char[] arrayChars = trabalenguas.toCharArray();
        int largo = arrayChars.length; //en int es un atributo, en String seria un metodo porque va con ()

        for (int i = 0; i < largo; i++) {
            System.out.print(arrayChars[i]); //println para imprimir cada caracter en una linea
        }

        System.out.println();
        //divide el string segun un patron
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        //quita las A y los divide en elementos de un array
        String[] array2 = trabalenguas.split("a");
        for (int j = 0; j < array2.length; j++) {
            System.out.println(array2[j]); // array2 = ["tr", "b", "lengu", "s"]
        }

        String archivo = "alguna.imagen.pdf";
        //salimos con el doble back slash
        String[] archivoArr = archivo.split("[.]"); //tambien funciona \\.;
        int longitud = archivoArr.length;

        for (int k = 0; k < longitud; k++) {
            System.out.println(archivoArr[k]);
        }

        System.out.println("extension: " + archivoArr[longitud-1]);
    }
}
