package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcesaBorrado {
	private BufferedReader reader;

	public String readFile(String fileName){
		String returnValue = "";
        FileReader file = null;
        
        try{
            file = new FileReader(fileName);
            reader = new BufferedReader(file);
            String line = "";
            while ((line = reader.readLine()) != null)
                returnValue += line + "\n";
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if (file != null)
                try{
                    file.close();
                }catch(IOException e){}
        }
        
        return returnValue;
	}
}
