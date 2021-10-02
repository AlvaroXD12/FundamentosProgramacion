import java.util.Scanner;
public class CosteandoPasajeporBus {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variables e inicializacion
    int alumn=0; double costo=0;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de alumnos que van a viajar:");
    alumn=entrada.nextInt();
    //Proceso
    if(alumn>100){
      costo=(20*alumn);
    }else{
    if(alumn>=50 && alumn<=100){
      costo=(35*alumn);
    } else{
    if(alumn>=20 && alumn<49){
      costo=(40*alumn);
    }else{
    if(alumn<20){
      costo=(70*alumn);
    }}}}
    //Datos de salida
    System.out.println("Costo del viaje en total es de: $" +costo);       
  }
}