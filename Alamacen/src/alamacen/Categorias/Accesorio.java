package Alamacen.Categorias;

import alamacen.Cls_Producto;
import java.io.Serializable;

/**
 * @author ESFOT
 */
//Tipo: (mochila, cobertor, parlante, etc) 
public class Accesorio extends Cls_Producto implements Serializable{
    
    private String tipo;
    private String color;
    
    public Accesorio() {
    }

    public Accesorio(String nombre, double precio, String marca, String tipo, String color) {
        super(nombre, precio, marca, tipo);
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
}

