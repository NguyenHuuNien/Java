package model;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class SaveFile {
	public static boolean saveFile(ArrayList<KhachHang>dsKH,String path) {
		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			String S;
			for (KhachHang o:dsKH) {
				S = o.getMa()+";"+o.getName()+";"+o.getPhone();
				bw.write(S);
				bw.newLine();
			}
			bw.close();  fw.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
