import 'dart:io';

void main(){
    double a = double.parse(stdin.readLineSync()!);
    double b = double.parse(stdin.readLineSync()!);
    
    double media = (a * 3.5 + b * 7.5)/11;
    
    if (media <= 10){
      print("MEDIA = ${media.toStringAsFixed(5)}");  
    } else {
        print('10');
    }
}