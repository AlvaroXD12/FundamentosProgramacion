import java.util.Scanner;
public class PremiodeSalario {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
   //Declaracion de variable e inicializacion
   double sA=0; int pU=0; double pR=0;
   //Datos de entrada
   System.out.println("Ingrese su salario minimo:");
   sA=entrada.nextDouble();
   System.out.println("Ingrese el valor de puntos:");
   pU=entrada.nextInt();
   //Proceso
   if(pU<=100)
      pR=(sA);
   if(pU>=101 && pU<=150)
      pR=(sA*2);
   if(pU>150)
      pR=(sA*3);
   //Datos de salida
    System.out.println("Su bono es de:" +pR);
  }
}