import java.util.Scanner;
class EstCiclicas {
  static Scanner sc = new Scanner(System.in);
  static void suma20mumerosPares(){
  //Declarar variables e inicializacion de valores
  int sumaNumPar=0;
  //Proceso
    for(int numInit; numInt <= 20; numInt++) {
      System.out.println("numInit:"+numInit+"sumaNumbPar:"+sumaNumbPar)
      if(numInit%2==0){
        sumaNumPar=sumaNumPar+numInit;
      }
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}
} 
 static void menuOpciones(){ 
    int opcionesA=0;
    System.out.println("-------------------------------");
    String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares:";
    System.out.println(msg);
    opcionesA=sc.nextInt();  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: suma20mumerosParesWhile();break;
          case 2: suma20mumerosParesFor();break;
          default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  }