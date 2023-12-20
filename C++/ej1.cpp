#include <iostream>
#include <string>
#include <algorithm>

int main() {
  std::cin.tie(nullptr);
  std::ios_base::sync_with_stdio(false);

  // TODO: fixme.
  //  Leer la cadena de entrada
  std::string cadena;
  std::getline(std::cin, cadena);

  // Invertir la cadena
  std::reverse(cadena.begin(), cadena.end());

  //  Imprimir la cadena invertida
  std::cout << cadena << std::endl;

  return 0;
}