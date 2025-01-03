public class ConcatenarStrings {
    public static void main(String[] args) {
        String curso = "Programacion con Java";
        String alumno = "Mateo Fiorotto";

        String detalle = curso + " realizado por el alumno " + alumno;
        System.out.println(detalle);

        //otra forma:
        //no modifica curso, sino que retorna otra instancia
        //podemos ir anidado los concat. Este metodo es más eficiente que el +
        //String detalle2 = curso.concat(" realizado por el alumno ".concat(alumno));
        String detalle2 = curso.concat(" realizado por el alumno ").concat(alumno);
        System.out.println(detalle2);

        //Concatenacion con numeros
        int numeroA = 10;
        int numeroB = 5;

        // Como las expresiones se leen de izquierda a derecha, en el primer caso suma los numeros y en el segundo los concatena
        System.out.println("Primero los dos numeros y luego detalle: " + numeroA + numeroB + " " + detalle);
        System.out.println("Primero detalle y luego los dos numeros: " + detalle + " " + numeroA + numeroB);
        // Pero si usamos los parentesis cambiamos la precedencia, es decir, el orden
        System.out.println("Primero detalle pero con parentesis: " + detalle + " " + (numeroA + numeroB));
    }
}
