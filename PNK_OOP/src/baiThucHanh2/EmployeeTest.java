package baiThucHanh2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee nhan1 = new Employee("Hyu","Nie",1000.00);
		Employee nhan2 = new Employee("Leo","Messi",500.00);
		nhan1.setTen("Nien");
		nhan1.setLuong(1500.00);
		
		nhan2.setHo("Neymar");
		nhan2.setTen("Jr.");
		
		System.out.println("Luong nam cua " + nhan1.getTen() + " = " + nhan1.getLuong()*12);
		System.out.println("Luong nam cua " + nhan2.getTen() + " = " + nhan2.getLuong()*12);
		System.out.println("====Tang Luong====");
		nhan1.setLuong(nhan1.getLuong()+nhan1.getLuong()*0.1);
		nhan2.setLuong(nhan2.getLuong()+nhan2.getLuong()*0.1);
		System.out.println("Luong nam cua " + nhan1.getTen() + " = " + nhan1.getLuong()*12);
		System.out.println("Luong nam cua " + nhan2.getTen() + " = " + nhan2.getLuong()*12);
	}

}
