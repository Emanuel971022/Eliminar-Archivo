/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author DanielVegaSantos
 */
public class Read {

    public String readTextFile(String fileName) {
        String returnValue = "";
        FileReader file = null;
        try {
            file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            String line = "";
            while ((line = reader.readLine()) != null) {
                returnValue += line + "\n";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                }
            }
        }
        return returnValue;
    }

    public void createFiles(String fileName) {
        FileReader file;
        Map<String,Integer> clientFunds = new HashMap<>();
        Map<String,String> clientLocationFile = new HashMap<>();
        try {
            String content = "";
            String name = "";
            String clientID = "";
            
            int funds = 0;
            
            file = new FileReader(fileName);
            BufferedWriter output;
            BufferedReader reader = new BufferedReader(file);
            
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.charAt(0) == 'C') {
                    funds = 0;
                    name = "src/txts/" + line + ".dat";
                    String[] vector = line.split("-");
                    clientID = vector[0];
                    clientLocationFile.put(clientID, name);
                    if(clientFunds.get(clientID) == null){
                       clientFunds.put(clientID, 0); 
                    }
                    File f = new File("src/txts/" + line + ".dat");
                    f.createNewFile();
                }
                else{
                    String[] vector = line.split("\\|");
                    if(vector[1].equals("Retira")){
                        funds -= Integer.parseInt(vector[vector.length-1]);
                    }
                    else if(vector[1].equals("Consigna")){
                        funds += Integer.parseInt(vector[vector.length-1]);
                    }
                    clientFunds.put(clientID, funds);
                    //System.out.println(funds);
                    output = new BufferedWriter(new FileWriter(name, true));
                    output.append(line + "\n");
                    output.close();
                }
            }
            for (Map.Entry pair : clientLocationFile.entrySet()) {
                    output = new BufferedWriter(new FileWriter(pair.getValue().toString(), true));
                    output.append(clientFunds.get(pair.getKey().toString()) + "\n");
                    output.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void writeTextFile(String fileName, String s) {
        FileWriter output = null;
        try {
            output = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(output);
            writer.write(s);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    // Ignore issues during closing
                }
            }
        }
    }

}
