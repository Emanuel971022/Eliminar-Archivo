package logica;

/**
 *
 * @author Emanuel Martínez Pinzón
 */
public class Docente extends Academico implements Persona{

    @Override
    public void
            generarCodigo(){
        System.out.println("Docente.generarCodigo");
    }

    @Override
    public void generarPrograma(){
        System.out.println("Docente.generarPrograma");
    }

    @Override
    public void mostrarNombre(){
        System.out.
                println("Docente.mostrarNombre");
    }
}
