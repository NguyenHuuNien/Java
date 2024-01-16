package ObjectClass;

import java.util.ArrayList;
import java.util.List;

public class KhoaHoc {
    private String tenKhoaHoc;
    private List<HocVien> dsHocVien;
    private GiangVien giangVien;
    private int[] soLuong = new int[2];
    private String thoiGian;

    public KhoaHoc() {
        dsHocVien = new ArrayList<>();
    }

    public KhoaHoc(String tenKhoaHoc, GiangVien giangVien,int maxHocVien,String thoiGian) {
        this.tenKhoaHoc = tenKhoaHoc;
        this.giangVien = giangVien;
        this.thoiGian = thoiGian;
        this.soLuong[1] = maxHocVien;
        dsHocVien = new ArrayList<>();
    }
    
    public void addHocVien(HocVien hv){
        dsHocVien.add(hv);
        soLuong[0] = dsHocVien.size();
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
