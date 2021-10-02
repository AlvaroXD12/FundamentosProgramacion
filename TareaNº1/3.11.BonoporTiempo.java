import java.util.Scanner;
public class BonoporTiempo {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variables e inicializacion
    double tiempo=0; double bOno=0;
    //Datos de entrada
    System.out.println("Ingrese los años que lleva trabajando en esta tienda:");
    tiempo=entrada.nextDouble();
    //Proceso
    if(tiempo==1)
      bOno=100;
    if(tiempo==2)
      bOno=200;
    if(tiempo==3)
      bOno=300;
    if(tiempo==4)
      bOno=400;
    if(tiempo==5)
      bOno=500;
    if(tiempo>5)
      bOno=1000;
    //Datos de salida
    System.out.println("Su bono es de: $" +bOno);      
  }
}