package Alamacen.Categorias;

import alamacen.Cls_Producto;
import java.io.Serializable;

/**
 * @author ESFOT
 */
//Tipo: (laptop, pc) 
public class Computador extends Cls_Producto implements Serializable{
    
    private String tipo;
    private int almacenamiento;//Gb
    private int ram;//Gb
    private String procesador;//ej: Intel, AMD 

    public Computador() {
    }

    public Computador(String tipo, int almacenamiento, int ram, String procesador) {
        this.tipo = tipo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }

    public Computador(String nombre, double precio, String marca, String tipo, int almacenamiento, int ram, String procesador) {
        super(nombre, precio, marca, tipo);
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
    
    
}
