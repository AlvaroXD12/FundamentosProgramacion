import java.util.Scanner;
class EstCiclicas {
  static Scanner sc = new Scanner(System.in);
  static void suma20mumerosPares(){
  //Declarar variables e inicializacion de valores
  int sumaNumPar=0;
  //Proceso
    for(int numInit; numInt <= 20; numInt++) {
      if(numInit%2==0){
        sumaNumPar=sumaNumPar+numInit;
      }
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}
} 