import.java.util.Scanner;
public class Descuento{
   static Scanner sc = new Scanner(System.in);
   static void DescPrest(){
     //Declaracion de variables e inicializacion
     double precio=0; descuento=0;
     //Datos de entrada
     System.out.println("Ingrese el precio:");
     precio=sc.nextDouble();
     //proceso
     if(precio>=200){
       descuento=precio*0.15;     
     }else if(precio>=100 && precio<200){
       descuento=precio*0.12
     }else(precio<100){
       descuento=precio*0.10
     }
     //Datos de salida
      System.out.println("Erhobuena usted tiene desceunto")
   }
}