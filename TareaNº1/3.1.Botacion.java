import java.util.Scanner;
public class 3.1.Botacion {
  static Scanner entrada= new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variable e iniciacion
    int edad=0;
    //Datos de entrada
     System.out.println("Ingrese su edad:");
     edad=entrada.nextInt();
     //Proceso
     if(edad>=18){
       System.out.println("Usted si puede votar por tener:" + edad);
     }else{
     if(edad<18){
       System.out.println("Usted no puede votar por tener:" + edad);
     }
       
     }
    }
}