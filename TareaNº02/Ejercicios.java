import java.util.Scanner;
public class Ejercicios {
  static Scanner sc = new Scanner(System.in);

  static void ejercicio1(){
    //Declaracion de variables e inicializacion
    double salario=0;
    //Datos de entrada
    System.out.println("Ingrese su salario:");
    salario=sc.nextInt();
    //Proceso
    for(int tiempo=1; tiempo <= 6; tiempo++) {

      if(tiempo%1==0){
        salario=salario+(salario/10);
      }
      System.out.println("Años trabajando:"+tiempo+ "Aumento del salario por año:"+salario);
    }
    //Datos de salida
    System.out.println("Su salario es de:"+salario);
  }

  static void ejercicio2(){
  //Declaracion de variables e inicializacion
  int nh=0; int THambur=0; int tarjeta=0; double pAgo=0;
  //Datos de entrada 
  System.out.println("Cantidad de hamburguesas:");
  nh=sc.nextInt();
  System.out.println("Seleccione el tipo de hamburguesa:");
    System.out.println("\t1.-Hamburguesa sencilla $20");
    System.out.println("\t2.-Hamburguesa doble $25");
    System.out.println("\t3.-Hamburguesa triple $28");
    System.out.print("\t: ");
    do{
     THambur=sc.nextInt();
     if(THambur<1||THambur>3)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (THambur<1||THambur>3);
    System.out.println("Pagara con tarjeta:");
    System.out.println("\t1.-si");
    System.out.println("\t2.-no");
    System.out.print("\t: ");
    do{
     tarjeta=sc.nextInt();
     if(tarjeta<1||tarjeta>2)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (tarjeta<1||tarjeta>2);
  //Proceso
  if(THambur==1 && tarjeta==1)
   pAgo= nh*20 + (nh*20*0.05);
   else
  if(THambur==1 && tarjeta==2)
  pAgo=(nh*20);
  if(THambur==2 && tarjeta==1)
   pAgo= nh*25 + (nh*25*0.05);
   else
  if(THambur==2 && tarjeta==2)
  pAgo=(nh*25);
  if(THambur==3 && tarjeta==1)
   pAgo= nh*28 + (nh*28*0.05);
   else
  if(THambur==3 && tarjeta==2)
  pAgo=(nh*28);
  //Datos de salida
  System.out.println("El monto a pagar por las hamburguesas es de:" +pAgo);   
  }

  static void ejercicio3(){
    //Declaracion de variables e inicializacion
    int x=1, total, n, mayores=0 ,menores=0;
    //Datos de entrada
    System.out.println("Ingrese el total de numeros:");
    total=sc.nextInt();
    //Proceso
    while(x<=total){
    System.out.println("Ingrese un numero");
    n=sc.nextInt();
    if(n<=0)
    menores=menores+1;
    else
    mayores=mayores+1;
    x=x+1;
    }
    //Datos de salida
    System.out.println("El total de numeros menores o igual a cero es:" +menores);
    System.out.println("El total de numeros mayores de cero es:" +mayores);
  }

  static void ejercicio4(){
    //Declaracion de variables e inicializacion
    int n, color, rojo=0 ,blanco=0, verde=0;
    //Datos de entrada
    System.out.println("Ingrese el lote de focos:");
    n=sc.nextInt();
    //Proceso
    while(n>0){
    System.out.println("Selecciona un color");
    System.out.println("\t1.- verde");
    System.out.println("\t2.- blanco");
    System.out.println("\t3.- rojo");
    System.out.print("\t: ");
    color=sc.nextInt();
    if(color>=1 && color<=3)
     if(color==1)
     verde=verde+1;
     else
     if(color==2)
     blanco=blanco+1;
     else
     rojo=rojo+1;
     n=n-1;   
    }
    //Datos de salida
    System.out.println("El total de focos verdes es:" +verde);
    System.out.println("El total de focos blancos es:" +blanco);
    System.out.println("El total de focos rojos es:" +rojo);
  }

  static void ejercicio5(){
    //Declaracion de variables e inicializacion
    double ahorro=0;
    //Proceso
    for(int a=1; a <= 365; a++) {

      if(a%1==0){
        ahorro = ahorro + Math.pow(3,a);
      }
      System.out.println("El dia :" + a + "Hubo un ahorro de:" +ahorro);
    }
    //Datos de salida
    System.out.println("el ahorro total es:"+ahorro);
  }

  static void ejercicio6(){
    //Declaracion de variables e inicializacion
    int año;
    double ahorro=0; double interes=0; double total=0; double t=0;
    //Datos de entrada
    System.out.println("Ingresa los años de ahorro:");
    año=sc.nextInt();
    //Proceso
     while(año>0){
     for(int x=1; x <= 12; x++) {
      if(x%1==0){
      System.out.println("Ingrese el ahorro del mes:" +x);
      ahorro=sc.nextInt();
      total=total+ahorro;
      }}
      año=año-1; 
      interes=interes+(total/10); 
      t=interes+total;
      System.out.println("El interes es de:"+interes);
      System.out.println("La inversion total es:"+t);
      }
  }

  static void ejercicio7(){
    //Declaracion de variables e inicializacion
    int salones, edad=0; double tot=0; double nudeAlumn=0;
    double suma=0; double alumnos=0;
    //Datos de entrada
    System.out.println("Ingresa la cantidad de salones:");
    salones=sc.nextInt();
    //Proceso
     while(salones>0){
      System.out.println("Ingrese el numero de alumnos:");
      nudeAlumn=sc.nextInt();
     for(int x=1; x <= nudeAlumn; x++){
       if(x%1==0){
         System.out.println("Ingrese la edad:" +x);
         edad=sc.nextInt();
         suma=suma+edad;
         }
      }
      alumnos=alumnos+nudeAlumn;
      System.out.println("El promedio del salon " +salones+ " es: " +(suma/nudeAlumn)+ " años");
      salones=salones-1;
      
    }
    //Datos de salida
     tot=tot+suma;
     System.out.println("El promedio de toda la escuela es:" +(tot/alumnos)+ "años");
  }

  static void MenuOpciones(){ 
  //Declaracionde variables
  int opc=0;
  System.out.println("------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar1=xxxx 2=xxxx:";
  System.out.println(msg);
  opc=sc.nextInt();  
  while(opc!=0){
    switch(opc) {
    case 1: ejercicio1();break;
    case 2: ejercicio2();break;
    case 3: ejercicio3();break;
    case 4: ejercicio4();break;
    case 5: ejercicio5();break;
    case 6: ejercicio6();break;
    case 7: ejercicio7();break;
     default:
     System.out.println("El Algoritmo no existe!");
    }   
    System.out.println("------------------------------");  
    System.out.println(msg);
    opc=sc.nextInt();        
  }}   

  public static void main(String[] args) {
    MenuOpciones();
  }
}