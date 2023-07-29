package checkFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadFile {
	public static ArrayList<String> loadFileVie(String path){
		ArrayList<String> fileVie = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				fileVie.add(line);
			}
			br.close(); fr.close();
			return fileVie;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static ArrayList<String> loadFileJp(String path){
		ArrayList<String> fileJp = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				fileJp.add(line);
			}
			br.close(); fr.close();
			return fileJp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
