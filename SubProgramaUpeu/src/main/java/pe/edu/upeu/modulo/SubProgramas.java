package pe.edu.upeu.modulo;

public class SubProgramas{

  public String nombre:"Alvaro";
  public String dni:"";

  public void saludo(){
    System.out.println("hola"+nombre);
  }

  public void otroSaludo(String nombrex){
    this.nombre=nombrex;
    System.out.println("hola"+nombre);
  }

  
}