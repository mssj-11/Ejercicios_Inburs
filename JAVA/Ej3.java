/**
 *
 * @author HP - MSS | Chicharronera
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Coeficientes de la ecuación cuadrática
        double a, b, c;

        // Ingresa los coeficientes desde la consola
        String[] input = br.readLine().split("\\s");
        a = Double.parseDouble(input[0]);
        b = Double.parseDouble(input[1]);
        c = Double.parseDouble(input[2]);

        // Calcula el discriminante
        double discriminante = b * b - 4 * a * c;

        // Comprueba si hay soluciones reales
        if (discriminante >= 0) {
            // Calcula las soluciones y muestra los resultados sin decimales cuando sea posible
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Formatea los resultados para quitar decimales cuando sea posible
            String result1 = x1 % 1 == 0 ? String.valueOf((int) x1) : String.valueOf(x1);
            String result2 = x2 % 1 == 0 ? String.valueOf((int) x2) : String.valueOf(x2);

            System.out.println(result1 + " " + result2);
        } else {
            // No hay soluciones reales
            System.out.println("No hay soluciones reales.");
        }
    }
}
