public class StringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Mateo";

        //Para ver la longitud de un String (En un array serian 0M 1a 2t 3e 4o las posiciones)
        System.out.println(nombre.length());

        //Convertir a mayusculas / minusculas
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        //Comparar un String con otro a nivel de valor, no instancia
        System.out.println("Nombre.equals(\"Mateo\") = " + nombre.equals("Mateo")); //recordar que es caseSensitive
        System.out.println("Nombre.equalsIgnoreCase(\"mateo\") = " + nombre.equalsIgnoreCase("mateo")); //no es caseSensitive

        //si es 0 son identicos (ordena segun unicode, lexicograficamente)
        System.out.println(nombre.compareTo("Mateo"));

        //convertir string en caracteres y obtener uno en particular
        System.out.println(nombre.charAt(3)); //3 corresponde a e (matEo), si da OUT OF BOUND es que se pasa del limite, por lo tanto no hay caracter

        //toma una subcadena con inicio desde el 3 en adelante (toma eo)
        System.out.println("nombre.substring(3) = " + nombre.substring(3));
        //desde el 1 hasta el 4
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        //con este de forma dinamica podemos incluir el ultimo caracter:
        System.out.println("Ultimo caracter = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        //Reemplazamos todos los caracteres "a" por un "."
        System.out.println("trabalenguas.replace() = " + trabalenguas.replace("a",".")); //retorna una nueva instancia, no modifica la original

        //retorna la primera posicion donde encuentra el caracter, si devuelve -1 no lo encuentra (para validar por ej, tenemos que preguntar si lastIndexOf > 0)
        //puede buscar strings tambien
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.lastIndexOf('a')); // lo mismo pero busca la ultima

        //retorna true si contiene el string, sino false
        System.out.println("trabalenguas.contains() = " + trabalenguas.contains("al"));

        //empieza con / finaliza con
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("tra"));
        System.out.println("trabalenguas.endsWith() = " + trabalenguas.endsWith("guas"));

        //Quitar espacios en ambos lados (importante en web, forms, etc):
        System.out.println("   TRABALENGUAS sin trim");
        System.out.println("   TRABALENGUAS con trim".trim());
    }
}
