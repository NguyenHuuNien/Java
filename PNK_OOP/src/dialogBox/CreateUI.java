package dialogBox;

import javax.swing.JOptionPane;

public class CreateUI{
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Nhap a:"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Nhap b:"));
			JOptionPane.showMessageDialog(null,"Tong: " + (a + b) + "\nHieu: " + (a - b)
					+"\nTich: " + (a*b) + "\nChia co du: " + (a/b) + "\nDu: "+(a%b));
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nhap sai dinh dang",null, JOptionPane.WARNING_MESSAGE);
		}
	}
}
