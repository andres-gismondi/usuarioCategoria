package ejercicioCategoria;

public class Main {

    public static void main(String[] args) {

        Empresa despegar = new Empresa("Despegar",7000);

        Categoria tr = new Trainee();
        Categoria jr = new Junior();
        Categoria ssr = new SemiSenior();
        Categoria sr = new Señor();
        Categoria director = new Director();

        Usuario andres = new Usuario("Andres", "Gismondi", 9000, 1, despegar, tr);
        Usuario andres1 = new Usuario("Andres1", "Gismondi1", 9000, 2, despegar, jr);
        Usuario andres2 = new Usuario("Andres2", "Gismondi2", 9000, 3, despegar, ssr);
        Usuario andres3 = new Usuario("Andres3", "Gismondi3", 9000, 6, despegar, sr);
        Usuario andres4 = new Usuario("Andres4", "Gismondi4", 9000, 7, despegar, director );

        despegar.agregarEmpleado(andres);
        despegar.agregarEmpleado(andres1);
        despegar.agregarEmpleado(andres2);
        despegar.agregarEmpleado(andres3);
        despegar.agregarEmpleado(andres4);

        System.out.println(andres.calcularSueldo());
        System.out.println(andres1.calcularSueldo());
        System.out.println(andres2.calcularSueldo());
        System.out.println(andres3.calcularSueldo());
        System.out.println(andres4.calcularSueldo());
        System.out.println();

        andres1.cambiarCategoria(sr);

        System.out.println(andres.calcularSueldo());
        System.out.println(andres1.calcularSueldo());
        System.out.println(andres2.calcularSueldo());
        System.out.println(andres3.calcularSueldo());
        System.out.println(andres4.calcularSueldo());

    }
}
