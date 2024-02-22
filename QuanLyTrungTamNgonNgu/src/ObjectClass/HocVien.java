package ObjectClass;

import java.io.Serializable;

public class HocVien extends People implements Serializable{
    private String HocLuc;

    public HocVien() {
        super("HV");
    }

    public HocVien(String Name, int Tuoi,String gioiTinh,String SoDienThoai,String QueQuan,String HocLuc) {
        super("HV",Name, Tuoi,gioiTinh, SoDienThoai, QueQuan);
        this.HocLuc = HocLuc;
    }

    public String getFirstName(){
        String[] s = this.getName().split(" ");
        return s[s.length-1];
        
    }
    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }

    @Override
    public String toString() {
        return super.toString()+this.HocLuc;
    }
    
}
