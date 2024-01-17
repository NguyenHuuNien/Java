package ObjectClass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class KhoaHoc implements Serializable{
    private String NgonNgu;
    private static int curID = 5000;
    private int IDKhoaHoc;
    private String tenKhoaHoc;
    private int gia;
    private List<HocVien> dsHocVien;
    private GiangVien giangVien;
    private int[] soLuong = new int[2];
    private String thoiGian;

    public KhoaHoc() {
        this.IDKhoaHoc = curID;
        curID++;
        dsHocVien = new ArrayList<>();
    }

    public KhoaHoc(String NgonNgu, String tenKhoaHoc,int Gia, GiangVien giangVien,int maxHocVien,String thoiGian) {
        this.IDKhoaHoc = curID;
        curID++;
        this.NgonNgu = NgonNgu;
        this.tenKhoaHoc = tenKhoaHoc;
        this.giangVien = giangVien;
        this.thoiGian = thoiGian;
        this.gia = Gia;
        this.soLuong[0] = 0;        
        this.soLuong[1] = maxHocVien;
        dsHocVien = new ArrayList<>();
    }

    public int getIDKhoaHoc() {
        return IDKhoaHoc;
    }

    public void setIDKhoaHoc(int IDKhoaHoc) {
        this.IDKhoaHoc = IDKhoaHoc;
    }
    
    public boolean addHocVien(HocVien hv){
        if(soLuong[0]<soLuong[1]){
            dsHocVien.add(hv);
            soLuong[0] = dsHocVien.size();
            return true;
        }else{
            return false;
        }
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgonNgu() {
        return NgonNgu;
    }

    public void setNgonNgu(String NgonNgu) {
        this.NgonNgu = NgonNgu;
    }
    
    public List<HocVien> getDSHocVien(){
        return dsHocVien;
    }
    public int[] getSoLuong(){
        return soLuong;
    }
    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
    
}