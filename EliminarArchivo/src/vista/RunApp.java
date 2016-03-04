package vista;

import java.io.File;
import java.util.ArrayList;
import controlador.ProcesaBorrado;
import lib.Notificacion;

public class RunApp {
	public static void main(String [] args){
		String killWord = Notificacion.ingresarPregunta("Sistema", "Ingrese una palabra que desea buscar en los ficheros para eliminar");
		
		ProcesaBorrado pb = new ProcesaBorrado();
		
		String file;
		String path = "src/test/";
		ArrayList<String> files = new ArrayList<>();
		ArrayList<String> deletes = new ArrayList<>();
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		for(int i=0; i<listOfFiles.length; i++)
			if(listOfFiles[i].isFile()){
				file = listOfFiles[i].getName();
				files.add(file);
				if(file.endsWith(".txt") || file.endsWith(".TXT"))
					System.out.println(file);
			}
		System.out.println("Se han terminado de listar los ficheros\n\n");
		
		for(String x: files){
			String text = pb.readFile(path+x);
			String noSpaces = text.replace(" ", "");
			
			if(noSpaces.length() < 200)
				if(x.endsWith(".txt") || x.endsWith(".TXT")){
					String lowerCase = noSpaces.toLowerCase();
				
					if(lowerCase.indexOf(killWord.toLowerCase()) != -1)			
						if(new File(path+x).delete())
							deletes.add(x);
				}
		}
		
		System.out.println("Se han eliminado los siguientes archivos");
		for(String x: deletes)
			System.out.println(x);
	}
}
