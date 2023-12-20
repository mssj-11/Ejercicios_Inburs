#include <iostream>
#include <cmath>

int main() {
    std::cin.tie(nullptr);
    std::ios_base::sync_with_stdio(false);

    // Coeficientes de la ecuación cuadrática (A, B, C)
    int A, B, C;
    std::cin >> A >> B >> C;

    // Calcular el discriminante
    int discriminante = B * B - 4 * A * C;

    // Calcular las soluciones utilizando la fórmula general
    double x1 = (-B + sqrt(discriminante)) / (2.0 * A);
    double x2 = (-B - sqrt(discriminante)) / (2.0 * A);

    // Imprimir las soluciones
    std::cout << x1 << " " << x2 << std::endl;

    return 0;
}