package khachHang;

import java.util.ArrayList;

import bank.Bank;

public class MainKhachHang {

	public static void main(String[] args) {
		ArrayList<Bank> ls = new ArrayList<>();
		Bank a = new Bank("Hyu Nie", "330106070055", 100);
		ls.add(a);
		Bank b = new Bank("Flo", "44367635353", 1000);
		ls.add(b);
		Bank c = new Bank("Tom", "3332450240241", 60);
		ls.add(c);
		// ================================
		a.napTien(10); 
		b.rutTien(400);
		c.rutTien(50);
		// ================================
		for(var o : ls) {
			System.out.println(o.toString()); 
		}
	}

}
