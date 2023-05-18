package xulyFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import khachHang.KhachHang;

public class LoadFile {
	public static ArrayList<KhachHang> loadFile(String path) {
	    ArrayList<KhachHang> kh = new ArrayList<KhachHang>();
	    FileReader fr = null;
	    BufferedReader br = null;
	    try {
	        fr = new FileReader(path);
	        br = new BufferedReader(fr);
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] infor = line.split(";");
	            kh.add(new KhachHang(infor[0], infor[1], infor[2], infor[3]));
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (br != null) {
	                br.close();
	            }
	            if (fr != null) {
	                fr.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    return kh;
	}

}
