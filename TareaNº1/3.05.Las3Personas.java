import java.util.Scanner;
public class Las3Personas {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variable
    int mayor=30; int medio=25; int menor=20; int cod=0;
    //Datos de entrada
    System.out.println("ingresar su codigo:");
    cod=entrada.nextInt();
    //Datos de salida
    if (cod==2504){
      System.out.println("Su nombre es Juan y su edad es:" +menor);
    }else{
    if (cod==2505){
      System.out.println("Su nombre es Pepe y su edad es:"+medio);
    }else{
    if (cod==2506){  
      System.out.println("Su nombre es Francisco y su edad es:" +mayor);
    }}}
  }
}