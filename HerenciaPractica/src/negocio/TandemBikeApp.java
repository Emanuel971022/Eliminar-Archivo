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
public class TandemBikeApp {
    public static void main(String [] args){
        Object stb = new TandemBike();
        //double km = stb.convertSpeed(15);
        
        TandemBike bike = (TandemBike) stb;
    }
}
