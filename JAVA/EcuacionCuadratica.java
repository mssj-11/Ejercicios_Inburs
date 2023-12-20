import java.util.Scanner;
//Entrada: 1 1 -6   &   la Salida debera de ser: 2 -3
/**
 *
 * @author HP - MSS | EcuacionCuadratica
 */
public class EcuacionCuadratica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coeficientes de la ecuación cuadrática
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calcula el discriminante
        double discriminante = b * b - 4 * a * c;

        // Comprueba si hay soluciones reales
        if (discriminante >= 0) {
            // Calcula las soluciones y muestra los resultados sin decimales cuando sea posible
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Imprime los resultados formateados
            System.out.printf("%.0f %.0f%n", x1, x2);
        } else {
            // No hay soluciones reales
            System.out.println("No hay soluciones reales.");
        }
    }


}