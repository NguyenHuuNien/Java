package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadFile {
	public static ArrayList<KhachHang> loadFile(String path){
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String S;
			ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
			while(true) {
				S = br.readLine();
				if (S == null) {
					break;
				}
				String arr[] = S.split(";");
				int ma = Integer.parseInt(arr[0]);
				dsKH.add(new KhachHang(ma,arr[1],arr[2]));
			}
			br.close();   fr.close();
			return dsKH;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
