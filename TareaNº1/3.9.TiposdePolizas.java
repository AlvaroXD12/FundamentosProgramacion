import java.util.Scanner;
public class TiposdePolizas {
  static Scanner in= new Scanner(System.in);
  public static void main(String[]args){
   //Declaracion de variables e inicializacion 
   int Padece_enfermedad, Tipo_de_poliza, Toma_alcohol, Utiliza_lentes;
   double cargos, costoPoliza, cuota, edad;
   //Datos de entrada
   System.out.println("Ingresa tu edad:");
   edad=in.nextDouble();
   in.nextLine();
   System.out.println("Seleccione la poliza que desea.");
   System.out.println("\t1.- A cobertura amplia");
   System.out.println("\t2.- B daños a terceros");
   System.out.print("\t: ");
  do{
     Tipo_de_poliza = in.nextInt();
     in.nextLine();
     if (Tipo_de_poliza<1||Tipo_de_poliza>2)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (Tipo_de_poliza<1||Tipo_de_poliza>2);
     System.out.println("Seleccione si o no, si toma alcohol.");
     System.out.println("\t1.- si");
     System.out.println("\t2.- no");
     System.out.print("\t: ");
  do{
     Toma_alcohol = in.nextInt();
     in.nextLine();
     if (Toma_alcohol<1||Toma_alcohol>2)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (Toma_alcohol<1||Toma_alcohol>2);
     System.out.println("Seleccione si o no, si usted utiliza lentes.");
     System.out.println("\t1.- si");
     System.out.println("\t2.- no");
     System.out.print("\t: ");
  do{
     Utiliza_lentes = in.nextInt();
     in.nextLine();
     if (Utiliza_lentes<1||Utiliza_lentes>2)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (Utiliza_lentes<1||Utiliza_lentes>2);
     System.out.println("Seleccione si o no, si usted padece de una enfermedad.");
     System.out.println("\t1.- si");
     System.out.println("\t2.- no");
     System.out.print("\t: ");
  do{
     Padece_enfermedad = in.nextInt();
     in.nextLine();
     if (Padece_enfermedad<1||Padece_enfermedad>2)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (Padece_enfermedad<1||Padece_enfermedad>2);
     //Proceso
     if(Tipo_de_poliza==1)
       cuota=1200;
     else
       cuota=950;
       cargos=0;
     if(Toma_alcohol==1)
       cargos=cargos+cuota*0.1;
     if(Utiliza_lentes==1)
       cargos=cargos+cuota*0.05;
     if(Padece_enfermedad==1)
       cargos=cargos+cuota*0.05;
     if(edad>40)
       cargos=cargos+cuota*0.2;
     else
       cargos=cargos+cuota*0.1;
     //Datos de salida
        costoPoliza=cuota+cargos;
        System.out.println("Valor de cuota: " + cuota);
        System.out.println("Valor de cargos: " + cargos);
        System.out.println("Valor de costo de la poliza: " + costoPoliza);
  }
}