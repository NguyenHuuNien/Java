package xulyFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import khachHang.KhachHang;

public class SaveFile {
	public static boolean saveFile(ArrayList<KhachHang> kh, String path) {
	    try (FileWriter fw = new FileWriter(path);
	         BufferedWriter bw = new BufferedWriter(fw)) {
	        for (KhachHang khachHang : kh) {
	            String line = khachHang.toString();
	            bw.write(line);
	            bw.newLine();
	        }
	        return true;
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

}
