package ejercicioCategoria;

public class Usuario {

    private String nombre;
    private String apellido;
    private int sueldoActual;
    private int experiencia;
    private Empresa empresa;
    private Categoria categoria;


    public Usuario(String nombre, String apellido, int sueldoActual, int experiencia, Empresa empresa, Categoria categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoActual = sueldoActual;
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.categoria = categoria;
    }

    public Empresa getEmpresa(){
        return empresa;
    }
    public int getSueldo(){
        return sueldoActual;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public double calcularSueldo(){
        return categoria.sueldoPromedio(this);
    }

}
