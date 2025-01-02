public class IntroduccionVariables {
    //intro
    public static void main(String[] args) {
        String saludar = "Hola!";
        System.out.println(saludar.toUpperCase());
        //touppercase metodo mayusculas
        //atajo: soutv (para system print y "saludar")

        //int primitivo
        int numero = 10;
        System.out.println("numero: " + numero);
        // tambien hay, long, byte, superint, bool, char, short, etc.. SIEMPRE SE ESCRIBEN EN MINUSCULAS
        // el numero no tiene metodos porque es un valor, no una clase como el String (el Integer si tiene)

        //boolean
        boolean valor = false;

        if (valor) {
            System.out.println("Valor verdadero");
        } else {
            System.out.println("Valor falso");
        }

        // Esto indidica que es un tipo flexible, si le saco las "" se vuelve integer
        var numero3 = "15";
        System.out.println("numero3 = " + numero3);
    }
}
