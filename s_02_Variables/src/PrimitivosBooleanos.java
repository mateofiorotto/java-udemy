public class PrimitivosBooleanos {
    public static void main(String[] args) {
        boolean verdadero = true;
        System.out.println("verdadero = " + verdadero);

        boolean falso = false;
        System.out.println("falso = " + falso);

        //clases bool
        boolean esVerdadero = Boolean.TRUE;
        System.out.println("esVerdadero = " + esVerdadero);
        boolean esFalso = Boolean.FALSE;
        System.out.println("esFalso = " + esFalso);
        // Es muy poco probable utilizar estas clases porque es mas comodo poner true o false simplemente
        // Es utilizado por los if, try, catch, etc

        double d = 98765.43e-3; // Numero final: 98.76543
        System.out.println("d = " + d);

        float f = 12345e2f; // 123.45
        System.out.println("f = " + f);

        //sin parentesis, es una sola expresion.
        boolean datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("3-2 = 1 ? = " + esIgual);
    }
}
