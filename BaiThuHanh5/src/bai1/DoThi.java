package bai1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoThi {

	public static void main(String[] args) throws IOException {
		List<Node> dsNode = new ArrayList<Node>();
		int n = 0, m = 0;
		try {
			FileReader fr = new FileReader("/home/hyunie/MyCode/Java/BaiThuHanh5/src/bai1/data.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("/home/hyunie/MyCode/Java/BaiThuHanh5/src/bai1/datafull.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = br.readLine();
			String[] s = line.split(" ");
			int u= Integer.parseInt(s[0]);
			int v = Integer.parseInt(s[1]);
			
			bw.write(u + " " + v);
			bw.newLine();
			
			for(int i=0;i<u;i++) {
				Node a = new Node(i);
				dsNode.add(a);
			}
			
			line = br.readLine();
			while(line != null) {
				s = line.split(" "); 
				n = Integer.parseInt(s[0]);
				m = Integer.parseInt(s[1]);
				Node a = dsNode.get(n);
				a.addDinhKe(m);
				Node b = dsNode.get(m);
				b.addDinhKe(n);
				bw.write(a.getDinh() + " " + a.getTrongSo() + " "
						+ b.getDinh() + " " + b.getTrongSo());
				bw.newLine();
				line = br.readLine();
			}
			
			bw.close(); fr.close();
			br.close(); fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int i=0;i<dsNode.size();i++) {
			System.out.println(dsNode.get(i).toString());;
		}
		
	}

}
