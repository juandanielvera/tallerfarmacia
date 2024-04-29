package co.edu.uniquindio.poo;

public class Gerente extends Empleado{

    public Gerente(String nombre, String apellidos, String dNI, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dNI, direccion, telefono, salario);   
    }

    @Override
    public String toString() {
        return "Gerente []";
    }

}