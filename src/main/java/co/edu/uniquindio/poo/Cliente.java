package co.edu.uniquindio.poo;

public  class Cliente extends Persona{

public Cliente(String nombre, String apellidos, String dNI, String direccion, String telefono) {
         super(nombre, apellidos, dNI, direccion, telefono);
        
 }
    @Override
    public String toString() {
        return "Cliente []";
    
    }
    
}