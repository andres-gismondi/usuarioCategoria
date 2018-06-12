package ejercicioCategoria;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private int sueldoBase;
    private List<Usuario> empleados;

    public Empresa(String nombre, int sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.empleados = new ArrayList<Usuario>();
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public List<Usuario> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Usuario> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Usuario user){
        empleados.add(user);
    }

    public int cantidadEmpleados(){
        return this.empleados.size();
    }
}
