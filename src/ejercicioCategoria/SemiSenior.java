package ejercicioCategoria;

public class SemiSenior extends Categoria{

    public double sueldoPromedio(Usuario user){
        return user.getExperiencia() * 5000;
    }

}
