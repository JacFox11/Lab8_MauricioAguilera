
package lab8_mauricioaguilera;


public class Cliente {
    private int cuenta;
    private String nombre;
    private String pass;
    private String productos;
    private String identidad;
    private int saldo;

    public Cliente(int cuenta, String nombre, String pass, String productos, String identidad, int saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.pass = pass;
        this.productos = productos;
        this.identidad = identidad;
        this.saldo = saldo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
