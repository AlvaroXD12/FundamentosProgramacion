import java.util.Scanner;
public class CalificacionporLetra {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
   //Declaracion de variable e inicializacion
   double Ca=0;
   //Datos de entrada
    System.out.println("Ingresa el valor de calificacion:");
    Ca=entrada.nextDouble();
   //Proceso
   if(Ca==10)
      System.out.println("A");
   if(Ca==9)
      System.out.println("B");
   if(Ca==8)
      System.out.println("C");
   if(Ca<=7 && Ca>=6)
      System.out.println("D");
   if(Ca<=5)
      System.out.println("F");
  }
}           