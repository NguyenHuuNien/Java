package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import demoQuanLyKhachHang.KhachHang;

public class SaveData {
	public static boolean saveData(ArrayList<KhachHang> a, String path) {
		try {
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Object o:a) {
				String line = o.toString();
				bw.write(line);
				bw.newLine();
			}
			bw.close(); fw.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public static boolean saveData(KhachHang a, String path) {
		try {
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String line = a.toString();
			bw.write(line);
			bw.newLine();
			bw.close(); fw.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
