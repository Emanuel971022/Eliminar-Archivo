/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Emanuel Martínez Pinzón
 */
public class TandemBike {
    public double convertSpeed(int mpg){
        double km = 0;
        km = mpg * 1.609344;
        return km;
    }
}
