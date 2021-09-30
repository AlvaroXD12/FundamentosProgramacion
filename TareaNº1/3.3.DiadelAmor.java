import java.util.Scanner;
public class DiadelAmor {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
     //Declaracion de variable e iniciacion
    double inversion=0;
    //Dato de entrada
    System.out.println("Ingrese la cantidad que tiene para invertir este 14 de febrero:"); 
    inversion=entrada.nextDouble();
    //Datos de salida
    if (inversion<=10){
      System.out.println("Usted puede reaglarle una tarjeta con sus: $" + inversion);
    }else{
    if (inversion>=11 && inversion<=100){
      System.out.println("Usted puede regalarle chocolates con sus: $" +inversion);
    }else{
    if (inversion>=101 && inversion<=250){
      System.out.println("Usted puede regalarle flores con sus: $" +inversion);
    }else{
    if (inversion>=251){
      System.out.println("Usted puede regalarle un anillo con sus: $" +inversion);
    }  
    }
    }
    }
  }
}