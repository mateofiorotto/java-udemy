public class PrimitivosACadenas {
    public static void main(String[] args) {
        //enteros
        int numeroInt = 100;

        //forma1
        String numeroStr = Integer.toString(numeroInt); //usando el wrapper
        System.out.println("numeroStr = " + numeroStr);

        //forma 2: recibe un int primitivo y lo convierte a string
        numeroStr = String.valueOf(numeroInt+10);
        //numeroStr = String.valueOf(numeroStr+10); -> esto lo concatena y devolvera 10010
        System.out.println("numeroStr = " + numeroStr);

        //Flotantes

        //Forma 1
        double realDuoble = 1.23243e2;
        String realString = Double.toString(realDuoble);
        System.out.println("realString = " + realString);

        //Forma 2
        realString = String.valueOf(1.23243e2f);
        System.out.println("realString = " + realString);
    }
}
