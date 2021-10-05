import java.util.Scanner;
public class Promedio {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args){
   //Declaracion de variable e inicializacion
   double sAlario=0; int pUntos=0; double pRemio=0;
   //Datos de entrada
   System.out.println("Ingrese su salario minimo:");
   sAlario=entrada.nextDouble();
   System.out.println("Ingrese el valor de puntos:");
   pUntos=entrada.nextInt();
   //Proceso
   if(pUntos>=100 && pUntos<=200)
      pRemio=(sAlario*0.10);
   if(pUntos>=201 && pUntos<=300)
      pRemio=(sAlario*0.40);
   if(pUntos>=301 &&pUntos<=400)
      pRemio=(sAlario*0.70);
   if(pUntos>=401) 
      pRemio=(sAlario*0.80);  
   //Datos de salida
    System.out.println("Su bono es de:" +pRemio);
  }
}