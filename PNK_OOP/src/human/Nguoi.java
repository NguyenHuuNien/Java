package human;

public class Nguoi {
	private String ten, nSinh, gTinh, qQuan;

	public Nguoi(String ten, String nSinh, String gTinh, String qQuan) {
		this.ten = ten;
		this.nSinh = nSinh;
		this.gTinh = gTinh;
		this.qQuan = qQuan;
	}

	public Nguoi() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getnSinh() {
		return nSinh;
	}

	public void setnSinh(String nSinh) {
		this.nSinh = nSinh;
	}

	public String getgTinh() {
		return gTinh;
	}

	public void setgTinh(String gTinh) {
		this.gTinh = gTinh;
	}

	public String getqQuan() {
		return qQuan;
	}
	

	public void setqQuan(String qQuan) {
		this.qQuan = qQuan;
	}
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", nSinh=" + nSinh + ", gTinh=" + gTinh + ", qQuan=" + qQuan + "]";
	}
}
