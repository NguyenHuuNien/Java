package ObjectClass;

import java.io.Serializable;

public class HocVien extends People implements Serializable{
    private String HocLuc;

    public HocVien() {
        super();
    }

    public HocVien(String Name, int Tuoi, String SoDienThoai, String QueQuan, String HocLuc) {
        super("HV",Name, Tuoi, SoDienThoai, QueQuan);
        this.HocLuc = HocLuc;
    }

    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }
    
}
