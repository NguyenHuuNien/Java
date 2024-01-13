package mainCheck;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import object.*;
import saveLoad.SaveLoad;

public class MainCheckProject {
	public static File path = new File("Test.txt");
	public static void main(String[] args) {
//		LopHoc Nihongo = new LopHoc(new Teacher("Hyu","Nie","Ninh Binh","0778421699",19,"HN7324","Nihongo N03"), 
//				"01/01/2024", "15/09/2024");
//		for (int i=0;i<20;i++) {
//			Nihongo.setDsStudent(new Student("Huu","Nien","Ninh Binh","094540531"+i,1+i,"HN00"+i,"Nihongo N03"));
//		}
//		List<LopHoc> dsLopHoc = new ArrayList<LopHoc>();
//		dsLopHoc.add(Nihongo);
//		SaveLoad.Save(dsLopHoc,path);
		
		System.out.println("Chay roi nhe");
		
		List<LopHoc> a = SaveLoad.Load(path);
		for(var o : a) {
			System.out.println(o.getGv().GioiThieu());
			List<Student> dsSt = o.getDsStudent();
			for(var k : dsSt) {
				System.out.println(k.GioiThieu());
			}
		}
		
	}
}
