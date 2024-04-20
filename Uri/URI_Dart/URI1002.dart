import 'dart:io';
import 'dart:math';

void main() {
  double raio = double.parse(stdin.readLineSync()!);
  double area = 3.14159 * pow(raio, 2);
  print("A=${area.toStringAsFixed(4)}");
}
