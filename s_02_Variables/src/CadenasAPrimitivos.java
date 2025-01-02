public class CadenasAPrimitivos {
    public static void main(String[] args) {
        String numeroStr = "50";
        //Convertimos la cadena a un entero (clase Integer)
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //Lo podemos replicar a doubles:
        String realStr = "978653.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //convertir a booleano (Si ponemos algo distinto a true / false siempre será false)
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }
}
