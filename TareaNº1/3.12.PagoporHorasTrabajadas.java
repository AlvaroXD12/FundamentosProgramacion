import java.util.Scanner;
public class PagoporHorasTrabajadas {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variables e inicializacion
    double PH=0; int HT=0; double pago=0;
    //Datos de entrada
    System.out.println("Ingrese las horas trabajadas en la semana:");
    HT=entrada.nextInt();
    System.out.println("Ingrese el pago por hora que recibe:");
    PH=entrada.nextDouble();
    //Proceso
    if(HT>=41 && HT<=45){
      pago=(2*PH*HT);
    }else{
    if(HT>=46 && HT<=50){
      pago=(3*PH*HT);
    }else{
    if(HT>50){
      System.out.println("No puede trabajar mas de 50 horas a la semana"); 
    }}} 
    //Datos de salida
    System.out.println("Su pago semanal es de:" +pago);  
  }
}