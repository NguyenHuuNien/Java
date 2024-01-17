package ObjectClass;

public class HocVien extends People{
    private String HocLuc;

    public HocVien() {
        super();
    }

    public HocVien(String ID, String Name, int Tuoi, String SoDienThoai, String QueQuan, String HocLuc) {
        super(Name, Tuoi, SoDienThoai, QueQuan);
        this.HocLuc = HocLuc;
    }

    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }
    
}
