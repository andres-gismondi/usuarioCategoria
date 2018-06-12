package ejercicioCategoria;

public class Director implements Categoria{

    public double sueldoPromedio(Usuario user){
        return ((user.getEmpresa().cantidadEmpleados()/10) * user.getSueldo());
    }

}
