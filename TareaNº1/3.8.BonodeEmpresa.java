import java.util.Scanner;
public class BonodeEmpresa {
   static Scanner entrada= new Scanner(System.in);
   public static void main(String[]args){
     //Declaracion de variables e inicializacion
     double bonoSu=0; double tiempo=0; double sueldo=0; double bonoA=0;
     //Datos de entrada
     System.out.println("Ingrese el sueldo que gana:");
     sueldo=entrada.nextDouble();
     System.out.println("Ingrese los años que lleva en la empresa:"); 
     tiempo=entrada.nextDouble();
     //Proceso
     if(tiempo>=5){
       bonoA=sueldo*0.30;
     }else{
     if(sueldo<1000){
       bonoSu=sueldo*0.25;
     }else{
     if(tiempo>=2 && tiempo<5){
       bonoA=sueldo*0.20;
     }else{
     if(sueldo>1000 && sueldo<=3500){
       bonoSu=sueldo*0.15;
     }else{
     if(sueldo>3500){
       bonoSu=sueldo*0.10;
     }}}}}  
     //Datos de salida
     if(bonoSu>bonoA){
       System.out.println("Su bono es de:" +bonoSu);    
     }else{
       System.out.println("Su bono es de:" +bonoA); 
     } 
  }  
} 