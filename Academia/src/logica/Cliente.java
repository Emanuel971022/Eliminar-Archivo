package logica;

/**
 *
 * @author Emanuel Martínez Pinzón
 */
public class Cliente {

    public static void main(String[] args){
        Academico p = new Docente();
        //p.mostrarNombre(); Da error
        
        ((Estudiante) p).generarPrograma();
        ((Academico) p).generarCodigo();
        ((Administrativo) p).mostrarNombre();
        
        Academico a = new Estudiante();
        a.generarPrograma();
        
        ((Academico) a).mostrarNombre();
        ((Docente) a).mostrarNombre();
        ((Docente) a).generarPrograma();
        ((Administrativo) a).mostrarNombre();
    }
}
