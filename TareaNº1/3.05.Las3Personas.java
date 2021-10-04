import java.util.Scanner;
public class Las3Personas {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[]args){
    //Declaracion de variable
    int edadA=0, edadB=0, edadC=0, eDad=0;
    String nombre1, nombre2, nombre3, mEnor="";
    //Datos de entrada
    System.out.println("ingresar su nombre:");
    nombre1=entrada.next();
    System.out.println("ingresar su edad:");
    edadA=entrada.nextInt();
    System.out.println("ingresar su nombre:");
    nombre2=entrada.next();
    System.out.println("ingresar su edad:");
    edadB=entrada.nextInt();
    System.out.println("ingresar su nombre:");
    nombre3=entrada.next();
    System.out.println("ingresar su edad:");
    edadC=entrada.nextInt();
    //Datos de salida
    if(edadA<edadB && edadA<edadC){
    eDad=edadA;
    mEnor=nombre1;
    }else{
    if(edadB<edadA && edadB<edadC){
    eDad=edadB;
    mEnor=nombre2;
    }else{
    if(edadC<edadA && edadC<edadB){
    eDad=edadC;
    mEnor=nombre3;
    }}}
    //Datos de salida
    System.out.println("La persona menor es: "+ mEnor +" y su edad es:" +eDad);
  }
}