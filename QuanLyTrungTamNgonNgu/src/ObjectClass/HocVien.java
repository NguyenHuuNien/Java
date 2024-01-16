package ObjectClass;

public class HocVien extends People{
    private double diem;
    private String HocLuc;

    public HocVien() {
        super();
    }
    
    public HocVien(double diem) {
        this.diem = diem;
    }

    public HocVien(double diem, String ID, String Name, String ChucVu, String SoDienThoai, String QueQuan) {
        super(ID, Name, ChucVu, SoDienThoai, QueQuan);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
}
