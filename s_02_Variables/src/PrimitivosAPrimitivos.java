public class PrimitivosAPrimitivos {
    public static void main(String[] args) {
        int i = 10000;
        //debemos forzamos la conversion (cast o casting)
        short s = (short)i; //tener cuidado con no convertir valores que no soporte el short o el tipo de variable en cuestion
        System.out.println("s = " + s);


        long l = i; // Si podria asignar un integer en un long porque tiene mas tamaño
        System.out.println("l = " + l);

        // El char se soporta pero se representa en unicode
        char b = (char)i;
        System.out.println("b = " + b);
        
        float f = (float)i;
        System.out.println("f = " + f);
    }
}
