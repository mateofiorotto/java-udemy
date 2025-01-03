public class ValidarStrings {
    public static void main(String[] args) {
        String curso = null;

        //Validación para saber si es NULL (NullPointException)
        boolean esNulo = (curso == null);
        System.out.println("curso es nulo? = " + esNulo);

        if (esNulo) {
            curso = "";
        }

        boolean estaVacio = curso.length() == 0; //tambien puede ser con >
        System.out.println("curso esta vacio? = " + estaVacio);

        //otra forma (atajo):
        boolean vacioForma2 = curso.isEmpty();
        //si esta vacio, ejecutar:

        //if (curso != null && curso.length() > 0)
        //if(curso.Empty() == false)

        if (vacioForma2) {
            curso = "Programacion con Java";
            System.out.println(curso.toUpperCase());
        }

        //Devuelven excepciones en caso de ser null:
        //System.out.println(curso.concat(" realizado por Mateo Fiorotto"));
        //System.out.println("bienvenido al curso".concat(curso));

        //No da error pero dira null:
        //System.out.println("bienvenido al curso" + curso);

        //Ademas de si esta vacio, comprueba si tiene solo espacios (forma mas segura y estricta):
        //JDK 11 En adelante
        String curso2 = "null";
        boolean tieneEspacioEnBlanco = curso2.isBlank();
        System.out.println("tieneEspacioEnBlanco = " + tieneEspacioEnBlanco);

    }
}
