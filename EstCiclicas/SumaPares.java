import java.util.Scanner;

public class SumaPares{
  static Scanner sc = new Scanner(System.in);
 
 static void Sumapares(){
  //Declarar variables e inicializacion de valores
  int suma=0; int A=0; int B=0;
  //Datos de entrada
  System.out.println("Ingrese el numero A:");
  A=sc.nextInt();
  System.out.println("Ingrese el numero B:");
  B=sc.nextInt();
  //Proceso
    for(A = A; A <= B ; A++){
      if(A%2 == 0){
      suma = suma+1;
      }
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre A y B es:"+suma);
    }
    public static void main(String[] args) {
    Sumapares();
    }  
}