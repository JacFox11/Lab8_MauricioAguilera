
package lab8_mauricioaguilera;

import java.util.Date;




public class Producto {
    private int cuenta;
    private String nombre;
    private int cantidad;
    private int precio;
    private String vencimiento;

    public Producto(int cuenta, String nombre, int cantidad, int precio, String vencimiento) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.vencimiento = vencimiento;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int percio) {
        this.precio = percio;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
