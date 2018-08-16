package Alamacen.Categorias;

import alamacen.Cls_Producto;
import java.io.Serializable;

/**
 * @author ESFOT
 */
//TIPO: RAM, disco duro, fuente de poder, etc
public class Componente extends Cls_Producto implements Serializable{
    
    private String tipo;
    private int capacidad;//Gb
    private int velocidad;//MHz
    
    public Componente() {
    }

    public Componente(String nombre, double precio, String marca, String tipo, int capacidad, int velocidad) {
        super(nombre, precio, marca, tipo);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
    
    
}

