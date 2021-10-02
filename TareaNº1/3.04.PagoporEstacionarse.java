import java.util.Scanner;
public class PagoporEstacionarse {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variable
    int hora=0; double cobrar=0;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de horas que ha estado estacionado:");
    hora=entrada.nextInt();
    //Proceso
    if (hora<=2){
      cobrar=(hora*5);
    }else{
    if (hora>2 && hora<=5){
      cobrar=(10+(hora-2)*4); 
    }else{
    if (hora>5 && hora<=10){
      cobrar=(22+(hora-5)*3);
    }else{
    if (hora>10){
      cobrar=(37+(hora-10)*1);
    }}}}
    //Datos de salida
    System.out.println("Usted debe pagar: $" +cobrar);
  }
}