package pe.edu.upeu.AMC;
import pe.edu.upeu.AMC.examen.*;
import pe.edu.upeu.AMC.utils.*;

public class App{
    
   public static ResolucionExamen re;  
   static LeerTeclado lt=new LeerTeclado();

   static void menuOpciones(){ 
    re=new ResolucionExamen();
    int opcionesA=0;
    System.out.println("-------------------------------");
    String msg="\nIngrese el Algoritmo que desea Probar"+ 
    "\n1=Sualudo"   
    ;
 
    opcionesA=lt.leer(0, msg);  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: re.ImpuestoPorAutomoviles(); break;
        }   
      System.out.println("------------------------------"); //15.511.210.043.330.985.984.000.000        
      opcionesA=lt.leer(0,msg);        
    }
  }

  public static void main( String[] args ){
     System.out.println("*******Bienvenidos al Sistema**********");      
    int edad=lt.leer(0,"Ingrese su edad");

    System.out.println(edad);
    
     menuOpciones();
  }
}
