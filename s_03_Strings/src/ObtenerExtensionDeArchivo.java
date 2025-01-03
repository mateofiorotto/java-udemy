public class ObtenerExtensionDeArchivo {
    public static void main(String[] args) {
        
        String archivo = "imagen.png";
        //usar lastIndexOf por si el nombre tiene antes algun .
        int i = archivo.lastIndexOf(".");

        //Automaticamente
        System.out.println("archivo.substring(i+1))) = " + archivo.substring(i+1));
    }
}
