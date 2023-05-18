package demoQuanLySinhVien;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class UpdateData {
	public static boolean updateData(SinhVien lsSV,String path) {
		try {
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			ArrayList<SinhVien> ls = new ArrayList<SinhVien>();
			ls = ReadingData.readingData(path);
//			ls.add(5,lsSV);
			Collections.sort(ls);
			String S;
			for(SinhVien o:ls) {
				S = o.getMs()+";"+o.getName()+";"+o.getAge();
				System.out.println(S);
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
