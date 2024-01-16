package ObjectClass;

public class People {
    private String ID;
    private String Name;
    private String ChucVu;
    private String SoDienThoai;
    private String QueQuan;

    public People() {
    }

    public People(String ID, String Name, String ChucVu, String SoDienThoai, String QueQuan) {
        this.ID = ID;
        this.Name = Name;
        this.ChucVu = ChucVu;
        this.SoDienThoai = SoDienThoai;
        this.QueQuan = QueQuan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    @Override
    public String toString() {
        return "People{" + "ID=" + ID + ", Name=" + Name + ", ChucVu=" + ChucVu + ", SoDienThoai=" + SoDienThoai + ", QueQuan=" + QueQuan + '}';
    }
    
}
