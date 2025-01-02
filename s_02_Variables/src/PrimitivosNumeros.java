public class PrimitivosNumeros {

    //variable de la clase
    static float varFlotante = 44.44F;

    public static void main(String[] args) {

        byte numByte = 7;
        System.out.println("numByte = " + numByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor MAXIMO " + Byte.MAX_VALUE);
        System.out.println("Valor MINIMO " + Byte.MIN_VALUE);

        short numeroShort = 3000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo SHORT corresponde en byte a " + Short.BYTES);
        System.out.println("tipo SHORT corresponde en bites a " + Short.SIZE);
        System.out.println("Valor MAXIMO " + Short.MAX_VALUE);
        System.out.println("Valor MINIMO " + Short.MIN_VALUE);

        //int = primitivo, Integer = clase
        int numeroInt = 3267349;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo INTEGER corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo INTEGER corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor MAXIMO " + Integer.MAX_VALUE);
        System.out.println("Valor MINIMO " + Integer.MIN_VALUE);

        long numeroLong = 191291926584L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo LONG corresponde en byte a " + Long.BYTES);
        System.out.println("tipo LONG corresponde en bites a " + Long.SIZE);
        System.out.println("Valor MAXIMO " + Long.MAX_VALUE);
        System.out.println("Valor MINIMO " + Long.MIN_VALUE);

        //desde jdk 10 en adelante (no soportado en Java 8)
        var variableFlexible = 127;
        System.out.println("variableFlexible = " + variableFlexible);

        //utilizamos F
        float realFloat = 21204F;
        //se puede escribir por ejemplo 2.12e3F (exponencial)
        System.out.println("realFloat = " + realFloat);
        System.out.println("float correspondiente en byte a = " + Float.BYTES);
        System.out.println("float correspondiente en bites a = " + Float.SIZE);
        System.out.println("float MAX = " + Float.MAX_VALUE);
        System.out.println("float MIN = " + Float.MIN_VALUE);

        double realDouble = 3.4039828E3;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double correspondiente en byte a = " + Double.BYTES);
        System.out.println("double correspondiente en bites a = " + Double.SIZE);
        System.out.println("double MAX = " + Double.MAX_VALUE);
        System.out.println("double MIN = " + Double.MIN_VALUE);

        //float varFlotante;
        System.out.println("varFlotante = " + varFlotante);
    }
}

