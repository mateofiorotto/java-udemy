public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion con Java"; //forma mas comun
        String curso2 = new String("programacion con java"); //con el constructor
        //todo objeto tiene una referencia distinta en nuestra aplicacion.

        boolean esIgual = curso == curso2;
        System.out.println("Son la misma referencia? = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("Los textos tienen el mismo valor? = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("es igual comparando sin caseSensitive? = " + esIgual);

        //esto devuelve true porque cuando creamos un objeto en la literal y con el mismo valor
        //no se crea un nuevo objeto por optimizacion, sino que se asigna la misma referencia
        String curso3 = "Programacion con Java";
        esIgual = curso == curso3; // rara vez se usa el ==, casi siempre es equals.
        System.out.println("curso3 es igual a curso? = " + esIgual);

    }
}