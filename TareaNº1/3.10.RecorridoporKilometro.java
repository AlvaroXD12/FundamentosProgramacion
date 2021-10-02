import java.util.Scanner;
public class RecorridoporKilometro {
  static Scanner in = new Scanner(System.in); 
  public static void main(String[]args){
    //Declaracion de variable e iniciacion
    double costo=0, presupuesto;
    //Datos de entrada
    System.out.print("Ingresa el valor del costo: ");
    costo=in.nextDouble();
    in.nextLine();
    System.out.print("Ingresa el valor de presupuesto: ");
    presupuesto=in.nextDouble();
    in.nextLine();
    //Proceso y Datos de salida
    if(costo*750*2<=presupuesto)
      System.out.println("Mexico");
    else
      System.out.println("Quedate en casa");
    if(costo*800*2<=presupuesto)
      System.out.println("Acapulco");
    if(costo*1200*2<=presupuesto)
      System.out.println("Puerto Vallarta");
    if(costo*1800*2<=presupuesto)
      System.out.println("Cancun");
  }
}