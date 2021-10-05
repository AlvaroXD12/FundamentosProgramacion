import java.util.Scanner;
public class Promedio {
  static Scanner entrada= new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variable e inicializacion
    int exam1=0; int exam2=0; int exam3=0;
    double promed1=0; double promed2=0; double promed3=0; double promedF=0;
    //Datos de entrada
    System.out.println("Ingrese la nota del examen Nº1:");
    exam1=entrada.nextInt();
    System.out.println("Ingrese la nota del examen Nº2:");
    exam2=entrada.nextInt();
    System.out.println("Ingrese la nota del examen Nº3:");
    exam3=entrada.nextInt();
    //Proceso
    if(exam1<=20){
      promed1=(exam1*0.25);
    if(exam2<=20){
      promed2=(exam2*0.25);
    if(exam3<=20){
      promed3=(exam3*0.50);
    }}}
    //Datos de salida
    promedF=promed1+promed2+promed3;
    System.out.println("Su promedio final es la nota de:" +promedF);
  }
}