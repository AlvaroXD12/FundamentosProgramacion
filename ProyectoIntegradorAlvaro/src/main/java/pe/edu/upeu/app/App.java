package pe.edu.upeu.app;

import pe.edu.upeu.modelo.ClienteTO;

/**
 * Hello world!
 *
 */
public class App{

    public static ClienteTO[] cliente;

    public static void ejemploCleinteVector() {
        System.out.println( "Hola Alvaro" );

        cliente=new ClienteTO[3];

        cliente[0]=new ClienteTO("15741546", "Max Maguiña", "953502845");
        cliente[1]=new ClienteTO("15722733", "Maritza Chilet", "991192200");
        cliente[2]=new ClienteTO("72317840", "Alvaro Maguiña", "953337437");
        System.out.println("DNI\tNombre\t\tCelular");
        for (ClienteTO cliente : cliente) {
            System.out.println(cliente.getDni()+"\t"+cliente.getNombre()+"\t\t"+cliente.getCelular());
        }        
    }

    public static void main( String[] args ){    
        MenuPrincipal mp=new MenuPrincipal();
        mp.mainLogin();
    }
}