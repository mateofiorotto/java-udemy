public class Inmutabilidad {
    public static void main(String[] args) {
        //Modificar un string con metodos cambia la referencia a otro objeto
        //es decir, no modifica el string original, retorna un objeto con el cambio

        String curso = "Programacion con Java";
        String alumno = "Mateo Fiorotto";

        String resultado = curso.concat(alumno);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println("Curso es igual a resultado? : " + (curso == resultado));

        //usando lambda y func. flecha. Se pasa curso por argumento
        String resultado2 = curso.transform(c -> {
            return c.concat(alumno);
        });
        //curso sigue siendo el mismo
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");
        //resultado es el mismo, se asigna a otra instancia, resultado3
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
