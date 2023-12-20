#include <iostream>

int main() {
  std::cin.tie(nullptr);
  std::ios_base::sync_with_stdio(false);

  // TODO: fixme.
  //  Leer el numero final de la sumatoria
  int numeroFinal;
  std::cin >> numeroFinal;

  //  Inicializar la variable para almacenar la sumatoria
  int sumatoria = 0;

  //  Calcular la sumatoria
  for(int i = 1; i <= numeroFinal; ++i){
    sumatoria += i;
  }

  //  Imprimir el resultado
  std::cout << sumatoria << std::endl;


  return 0;
}