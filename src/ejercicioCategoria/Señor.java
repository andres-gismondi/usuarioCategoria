package ejercicioCategoria;

public class Señor implements Categoria{

    public double sueldoPromedio(Usuario user){
        return (user.getSueldo() * 2);
    }

}
