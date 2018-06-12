package ejercicioCategoria;

public class Junior extends Categoria{

    public double sueldoPromedio(Usuario user){
        return ((user.getEmpresa().getSueldoBase()>user.getSueldo()) ? user.getEmpresa().getSueldoBase() : user.getSueldo());
    }

}
