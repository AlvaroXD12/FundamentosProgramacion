import java.util.Scanner;
public class PagoporHora {
 static Scanner entrada = new Scanner(System.in); 
 public static void main(String[]args){
   //Declaracion de variable e iniciacion
   double pAgo=0; double horasTrabajadas=0; double sueldo=0;
   //Datos de entrada
   System.out.println("Ingrese la cantidad que gana por hora:");
   pAgo=entrada.nextDouble();
   System.out.println("Ingrese la cantidad de horas trabajadas en la semana:");
   horasTrabajadas=entrada.nextDouble();
   //Proceso
    if(horasTrabajadas<=40){
      sueldo = (horasTrabajadas * pAgo); 
    }else{
    if(horasTrabajadas>40){
      sueldo = (pAgo * 40) + ((horasTrabajadas - 40) * (2 * pAgo)); 
    }  
    }
   //Datos de salida
   System.out.println("Su Sueldo de esta semana es:" + sueldo);
 }  
}