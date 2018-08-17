
package almacen.Categorias;

import almacen.ClsProducto;
import java.io.Serializable;

/**
 * @author 729-Producciones
 */
//Tipo: (mochila, cobertor, parlante, etc) 
public class Accesorio extends ClsProducto implements Serializable{
    
    private String color;
    
    public Accesorio() {
    }

    public Accesorio(String nombre, double precio, String marca, String tipo, String color) {
        super(nombre, precio, marca, tipo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
}
