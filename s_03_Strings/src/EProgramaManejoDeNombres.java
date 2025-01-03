import java.util.Scanner;

public class EProgramaManejoDeNombres {
//    La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
//    Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
//    Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
//    Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
//    Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
//    N.es_A.ia_E.pe

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre 1:");
        String primerNombre = scanner.nextLine();
        String primerNombre2 = primerNombre.toUpperCase().charAt(1) + "." + primerNombre.substring(primerNombre.length()-2);

        System.out.println("Ingrese nombre 2:");
        String segundoNombre = scanner.nextLine();
        String segundoNombre2 = segundoNombre.toUpperCase().charAt(1) + "." + segundoNombre.substring(segundoNombre.length()-2);

        System.out.println("Ingrese nombre 3:");
        String tercerNombre = scanner.nextLine();
        String tercerNombre2 = tercerNombre.toUpperCase().charAt(1) + "." + tercerNombre.substring(tercerNombre.length()-2);

        String resultado = primerNombre2 + "_" + segundoNombre2 + "_" + tercerNombre2;
        System.out.println("resultado = " + resultado);

    }
}
