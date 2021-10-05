import java.util.Scanner;
public class PremiodeSalario {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
    //Declaracion de variable e inicializacion
    double BN=0; double ANT=0; double sueldo=0;
    //Datos de entrada
    System.out.println("Ingrese el tiempo que ha trabajado en esta tienda:");
    ANT=entrada.nextDouble();
    System.out.println("Ingrese su sueldo:");
    sueldo=entrada.nextDouble();
    //Proceso
    if(ANT>4||sueldo<2000){
      BN=(sueldo*0.25);
    }else{
      BN=(sueldo*0.20);
    }
    //Datos de salida
    System.out.println("Su bono navideño es de:" +BN);
  }
}