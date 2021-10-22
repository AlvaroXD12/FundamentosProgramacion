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

  public static void main(String[] args) {
    ejercicio1();
  }
}