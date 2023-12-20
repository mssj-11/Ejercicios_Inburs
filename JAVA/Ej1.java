import java.util.Scanner;
/**
 *  Entrada: Cadena de prueba       Salida: abeurp ed anedaC
 * @author HP - MSS | InvertirCadena
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la línea completa
        String cadena = scanner.nextLine();

        // Convertir la cadena a un array de caracteres
        char[] caracteres = cadena.toCharArray();

        // Invertir el array de caracteres
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        // Imprimir la cadena invertida
        System.out.println(new String(caracteres));

        scanner.close();
    }
    
}