package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class LoadData {
	public static boolean loadData(String path) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while (true) {
				line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();  fr.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
