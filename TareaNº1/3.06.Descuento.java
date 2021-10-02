import java.util.Scanner;
public class Descuento {
   static Scanner entrada= new Scanner(System.in);
   public static void main(String[]args){
     //Declaracion de variables e inicializacion
     double precio=0; double descuento=0; double montototal=0;
     //Datos de entrada
     System.out.println("Ingrese el precio:");
     precio=entrada.nextDouble();
     //proceso
     if(precio>=200){
       descuento=precio*0.15;     
     }else{
       if(precio>=100 && precio<200){
       descuento=precio*0.12;
     }else{
       if(precio<100){
       descuento=precio*0.10;
     }}}
     //Datos de salida
      System.out.println ("El descuento es de: " + descuento);
      montototal= precio-descuento;
      System.out.println ("El monto total de la venta es de: " + montototal);
} }