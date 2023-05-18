package luyentap_Bai1;

public class KySu extends CanBo {
	private String nganhdaotao;
	private String ChucVu = "Ky Su";
	public KySu() {
		
	}
	public KySu(String name, int tuoi, String gioitinh, String diachi,String nganhdaotao) {
		super(name,tuoi,gioitinh,diachi);
		this.nganhdaotao = nganhdaotao;
	}
	public String getNganhdaotao() {
		return nganhdaotao;
	}
	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+ChucVu+" Chuyen nganh "+this.nganhdaotao;
	}
}
