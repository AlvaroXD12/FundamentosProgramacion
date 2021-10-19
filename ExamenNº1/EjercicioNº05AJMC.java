import java.util.Scanner;
public class EjercicioNº05AJMC {
  static Scanner entrada= new Scanner(System.in);
  static void promedio(){
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


static void comprovacion(){ 

  int opc=0;
  System.out.println("------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx, 2=xxxx:";
  System.out.println(msg);
  opc=entrada.nextInt();  
  while(opc!=0){
    switch(opc) {
    case 1: promedio();break;
    case 2: Premio();break;
     default:
     System.out.println("El Algoritmo no existe!");
    }   
    System.out.println("------------------------------");  
    System.out.println(msg);
    opc=entrada.nextInt();        
  }}


static void Premio(){ 
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
  public static void main(String[] args) {
  comprovacion();
 }}

