import 'dart:io';

void main(){
    int idade, soma = 0, contador = 0;
    
    while (true){
        idade = int.parse(stdin.readLineSync()!);
        if (idade < 0) break;
            soma += idade;
            contador++;
    }
            
    if (contador > 0){
        double media = soma / contador;
        print("${media.toStringAsFixed(2)}");
    }
}