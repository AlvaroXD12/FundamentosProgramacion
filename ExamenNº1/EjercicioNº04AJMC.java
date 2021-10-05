import java.util.Scanner;
public class dosValores {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args){
   //Declaracion de variable e inicializacion
   double valor1=0; int valor2=0; double resultado=0; 
   int signo;
   //Datos de entrada
    System.out.println("Ingresa el primer numero:");
    valor1=in.nextDouble();
    in.nextLine();
    System.out.println("Ingrese el segundo numero:");
    valor2=in.nextInt();
    in.nextLine();
    System.out.println("Ingrese el simbolo:");
    System.out.println("\t1 +");
    System.out.println("\t2 -");
    System.out.println("\t3 *");
    System.out.println("\t4 /");
    System.out.println("\t5 ^");
    System.out.print("\t: ");
    do{
     signo=in.nextInt();
     in.nextLine();
     if(signo<1||signo>5)
     System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
     }while (signo<1||signo>5);
     //Proceso 
     if(signo==1)
     resultado=valor1+valor2;
     if(signo==2)
     resultado=valor1-valor2;
     if(signo==3)
     resultado=valor1*valor2;
     if(signo==4)
     resultado=valor1/valor2;
     if(signo==5)
     resultado=Math.pow(valor1,valor2);
    //Datos de salida
    System.out.println("El resultado es:" +resultado);

  }
}