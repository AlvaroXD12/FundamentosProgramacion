package pe.edu.upeu.AMC.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeerTeclado{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public int leer(int val, String msg){
  System.out.print(msg+":");
  try{
    val=Integer.parseInt(br.readLine());
  }catch(Exception e){
    val=leer(val,msg);
  }
  System.out.println();
  return val;
}


public double leer(double val, String msg){
  System.out.print(msg+":");
  try{
    val=Double.parseDouble(br.readLine());
  }catch(Exception e){
    val=leer(val,msg);
  }
  System.out.println();
  return val;
}


public long leer(long val, String msg){
  System.out.print(msg+":");
  try{
    val=Long.parseLong(br.readLine());
  }catch(Exception e){
    val=leer(val,msg);
  }
  System.out.println();
  return val;
}

public String leer(String val, String msg){
  System.out.print(msg+":");
  try{
    val=br.readLine();
  }catch(Exception e){
    val=leer(val,msg);
  }
  System.out.println();
  return val;
}
}