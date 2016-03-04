package UFPS_POO2;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class Prueba {

    String dato[];
    
    public static void main(String[] args) {
        Archivo ar = new Archivo();
        System.out.println(ar.readTextFile("M2014Ciudad.csv"));
        
        ArrayList<String> dato = new ArrayList<>();
        
        FileReader arrr = new FileReader("1111;2222;33333;");
        BufferedReader file = new BufferedReader(arrr);
        
        
        
        String c = "2123232131231232323232";
        String[] n = c.split("");
    }

}
