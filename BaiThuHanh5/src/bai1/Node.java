package bai1;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int dinh;
	private double trongso;
	private List<Integer> dinhke;
	public Node() {}
	public Node(int dinh) {
		this.dinh = dinh;
		this.trongso = Math.round(Math.random()*100)/100.0;
		dinhke = new ArrayList<>();
	}
	public int getDinh() {
		return dinh;
	}
	public void setDinh(int dinh) {
		this.dinh = dinh;
	}
	public double getTrongSo() {
		return this.trongso;
	}
	public void addDinhKe(int dinh) {
		dinhke.add(dinh);
	}
	@Override
	public String toString() {
		String s = dinh + "," + dinhke.size() + "," + trongso + ",[";
		for(int i = 0;i<dinhke.size();i++) {
			s += dinhke.get(i) + "" ;
			if(i!=dinhke.size()-1) {
				s+=",";
			}
			else {
				s+="]";
			}
			
		}
		return s;
	}
}
