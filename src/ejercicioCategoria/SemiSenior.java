package ejercicioCategoria;

public class SemiSenior implements Categoria{

    public double sueldoPromedio(Usuario user){
        return user.getExperiencia() * 5000;
    }

}
