package demoQuanLySinhVien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadingData {
	public static ArrayList<SinhVien> readingData(String path){
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line;
			ArrayList<SinhVien> lsSV = new ArrayList<SinhVien>();
			while (true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				String lineRead[] = line.split(";");
				int ms = Integer.parseInt(lineRead[0]);
				String name = lineRead[1];
				int tuoi = Integer.parseInt(lineRead[2]);
				lsSV.add(new SinhVien(ms,name,tuoi));
			}
			br.close(); fr.close();
			return lsSV;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
