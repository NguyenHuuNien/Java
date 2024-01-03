package btUp_Down;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
	public static void main(String[] args) {
		List<Object> ls_Obj = new ArrayList<Object>();
		
		ls_Obj.add("String");
		ls_Obj.add(3);
		ls_Obj.add(3.5f);
		ls_Obj.add(1.7f);
		ls_Obj.add("66");
		
		for (Object object : ls_Obj) {
			if(object instanceof String) {
				System.out.println("This is String");
			}else if(object instanceof Integer) {
				System.out.println("This is int");
			}else if(object instanceof Float) {
				System.out.println("This is float");
			}
		}
	}
}
