package pe.edu.upeu.AMC.examen;

import java.util.Scanner;

public class ResolucionExamen {
    static Scanner sc = new Scanner(System.in);

    public void ImpuestoPorAutomoviles() {
        int i, n;
    double categoria_1=0, categoria_2=0, categoria_3=0, clave, costo;
    double impuesto, impuesto_a_pagar=0;
    
    System.out.print("Ingrese la cantidad de autos que posee: ");
    n=sc.nextInt();
    
    for (i=1; i<=n; i++){
      System.out.print("Auto " + i);
      System.out.print(" Ingrese el valor de clave del vehiculo: ");
      clave=sc.nextDouble();
      System.out.print("Ingresa el valor de costo: ");
      costo=sc.nextDouble();
      impuesto=0;
      if(clave==1)
        impuesto=costo*0.1;
        categoria_1=categoria_1+impuesto;
      if(clave==2)
          impuesto=costo*0.07;
          categoria_2=categoria_2+impuesto;
      if(clave==3)
          impuesto=costo*0.05;
          categoria_3=categoria_3+impuesto;

      impuesto_a_pagar=impuesto_a_pagar+impuesto;
      System.out.println("Valor de impuesto: " + impuesto);
    }
    //Datos de salida
    System.out.println("Valor de categoria 1: " + categoria_1);
    System.out.println("Valor de categoria 2: " + categoria_2);
    System.out.println("Valor de categoria 3: " + categoria_3);
    System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
  }
}    
  
