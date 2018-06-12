package ejercicioCategoria;

public class Usuario {

    private String nombre;
    private String apellido;
    private int sueldoActual;
    private Empresa empresa;
    private Categoria categoria;


    public Usuario(String nombre, String apellido, int sueldoActual, Empresa empresa, Categoria categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoActual = sueldoActual;
        this.empresa = empresa;
        this.categoria = categoria;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public int calcularSueldo(){
        return categoria.sueldoPromedio(this);
    }

}
