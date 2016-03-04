/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Emanuel Martínez Pinzón
 */
public class Administrativo extends Docente {

    @Override
    public void generarPrograma(){
        System.out.println("Administrativo.generarPrograma");
    }

    public void mostrarNombre(){
        System.out.println("Administrativo.mostrarNombre");
    }
}
