import java.util.Scanner;
public class Vacunas {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args){
    //Declaracion de variables e inicializacion
    int edad=0; int gEnero;
    //Datos de entrada
    System.out.println("Ingrese su genero:");
    System.out.println("\t1.-varon");
    System.out.println("\t2.-mujer");
    System.out.print("\t: ");
    do{
     gEnero=in.nextInt();
     in.nextLine();
     if(gEnero<1||gEnero>2)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (gEnero<1||gEnero>2);
    System.out.println("Ingrese su edad");
    edad=in.nextInt();
    in.nextLine();
    //Proceso y Datos de salida
    if(edad>=70)
    System.out.print("Usted debe ponerse la vacuna C");
    if(edad<70 && edad>=16)
     if(gEnero==1)
    System.out.print("Usted debe ponerse la vacuna A");
    if(edad<70 && edad>=16)
     if(gEnero==2)
    System.out.print("Usted debe ponerse la vacuna B");
    if(edad<16)
    System.out.print("Usted debe ponerse la vacuna A");
  }
}
