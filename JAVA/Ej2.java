import java.util.Scanner;
/**
 *  Entrada: 8      Salida: 36          La sumatoria de 1+2+3+4+5+6+7+8 = 36
 * @author HP - MSS | SumatoriaJuanito
 */
public class Ej2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número final de la sumatoria
        int numeroFinal = scanner.nextInt();

        // Inicializar la variable para almacenar la sumatoria
        int sumatoria = 0;

        // Calcular la sumatoria
        for (int i = 1; i <= numeroFinal; ++i) {
            sumatoria += i;
        }

        // Imprimir el resultado
        System.out.println(sumatoria);

        scanner.close();
    }
    
    
    
}