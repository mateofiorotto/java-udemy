public class StringsRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        //es mutable
        StringBuilder sb = new StringBuilder(a);
        //Calcular tiempo en el que tarda en ejecutarse el codigo
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            //con concat
            //c = c.concat(a).concat(b).concat("\n");
            //500 -> 1 o 2ms
            // A tener en cuenta: concat mientras mas elementos hay, mas ineficiente se vuelve y pasa a ser mejor el +

            //con el +
            //c+=a+b+"\n";
            //500 -> 8ms

            //StringBuilder (el más eficiente)
            sb.append(a).append(b).append("\n");
            //0ms, es el mas eficiente para concatenar grandes cantidades de texto
            //es lo mismo hacer esto tambien:
            //sb.append(a);
            //sb.append(b);
            //sb.append("\n");
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
    }
}
