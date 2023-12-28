package btth_ThuaKe;

public class CanBo extends Nguoi{
	private String cap_ham;
	private String chucvu;
	public CanBo() {
	}
	public CanBo(String hoten,String ngaysinh, String gioitinh, String quequan, String cap_ham, String chucvu) {
		super(hoten,ngaysinh,gioitinh,quequan);
		this.cap_ham = cap_ham;
		this.chucvu = chucvu;
	}
	public CanBo(String cap_ham, String chucvu) {
		super();
		this.cap_ham = cap_ham;
		this.chucvu = chucvu;
	}
	public String getCap_ham() {
		return cap_ham;
	}
	public void setCap_ham(String cap_ham) {
		this.cap_ham = cap_ham;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public void nhapCap_ham() {
		this.cap_ham = sc.nextLine();
	}
	public void nhapChucvu() {
		this.chucvu = sc.nextLine();
	}
	public void inCanBo() {
		super.inThongTin();
		System.out.println("Cap ham: " + this.cap_ham + "\nChuc Vu: " + this.chucvu);
	}
}
