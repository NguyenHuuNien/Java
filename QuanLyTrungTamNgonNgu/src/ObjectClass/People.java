package ObjectClass;

import java.io.Serializable;

public class People implements Serializable{
    private String ID;
    private String Name;
    private int Tuoi;
    private String gioiTinh;
    private String SoDienThoai;
    private String QueQuan;
    private static int numMakeID = 100;

    public People(String ID) {
        this.ID = ID + numMakeID;
        numMakeID++;
    }

    public People(String ID, String Name, int Tuoi,String gioiTinh, String SoDienThoai, String QueQuan) {
        this.ID = ID + numMakeID;
        this.Name = Name;
        this.Tuoi = Tuoi;
        this.SoDienThoai = SoDienThoai;
        this.QueQuan = QueQuan;
        this.gioiTinh = gioiTinh;
        numMakeID++;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
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
        return "People{" + "ID=" + ID + ", Name=" + Name + ", ChucVu=" + Tuoi + ", SoDienThoai=" + SoDienThoai + ", QueQuan=" + QueQuan + '}';
    }
    
}
