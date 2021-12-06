package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class ProductoDao extends AppCrud{

    LeerTeclado leertecla= new LeerTeclado();
    UtilsX util=new UtilsX();
    final String TABLA_PRODUCTO="Producto.txt";
    
    LeerArchivo leerArch;
    ProductoTO prodTO;

    String tipoProd="\nPeriodico\nRevista\n";

    public Object[][] crearProducto() {
        
        return null;

    }
    
}
