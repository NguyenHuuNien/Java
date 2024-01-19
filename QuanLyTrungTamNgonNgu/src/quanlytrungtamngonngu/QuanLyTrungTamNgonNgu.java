package quanlytrungtamngonngu;

import ObjectClass.GiangVien;
import ObjectClass.HocVien;
import ObjectClass.KhoaHoc;
import QuanLyUI.UI;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import saveLoad.SaveLoad;

public class QuanLyTrungTamNgonNgu {
    private static File path = new File("data.bin");
    private static void SetupData(){
        List<KhoaHoc> dsKH = new ArrayList<>();
        KhoaHoc i = new KhoaHoc();
        dsKH.add(i);
        KhoaHoc a = new KhoaHoc("Tiếng Anh","Lập trình Android",100000, new GiangVien("Nguyễn Hữu Niên", 19, "Nam","0778421699","Ninh Bình", "Tiến sĩ"), 100, "10/12/2023");
        KhoaHoc b = new KhoaHoc("Tiếng Nhật","Lập trình IOS",250000 ,new GiangVien("Nguyễn Hữu Đại", 50, "Nam","0985695395","Ninh Bình", "Thạc sĩ"), 50, "30/01/2023");
        KhoaHoc c = new KhoaHoc("Tiếng Trung","Cách tán gái",3500000 ,new GiangVien("Phạm Thị Hồng Ánh", 19,"Nữ", "0355336064","Ninh Bình", "Tiến sĩ"), 70, "20/01/2024");
        
        HocVien x = new HocVien("Phan Thái Hoàng", 14, "Nam" ,"091234567", "Hà Nội", "Khá");
        HocVien y = new HocVien("Nguyễn Thị Vân", 20,"Nữ" ,"091234567", "Hà Nội", "Giỏi");
        HocVien z = new HocVien("Trần Thanh Hoàng", 17, "Nam" ,"091234567", "Hà Nội", "Khá");
        HocVien m = new HocVien("Nguyễn Minh Văn", 19, "Nữ" ,"091234567", "Hà Nội", "Trung bình");
        HocVien n = new HocVien("Nguyễn Văn Thúi", 21,"Nam" ,"091234567", "Hà Nội", "Khá");
        HocVien q = new HocVien("Vũ Thị Nở", 22, "Nữ" ,"091234567", "Hà Nội", "Trung bình");
        HocVien p = new HocVien("Nguyễn Hoàng Nam", 18, "Nam" ,"091234567", "Hà Nội", "Khá");
        
        a.addHocVien(x); a.addHocVien(p); a.addHocVien(y); a.addHocVien(z);
        b.addHocVien(p); b.addHocVien(q); b.addHocVien(n); b.addHocVien(z);
        c.addHocVien(m); c.addHocVien(x); c.addHocVien(p); c.addHocVien(q);
        
        dsKH.add(a);    dsKH.add(b);    dsKH.add(c);
        
        SaveLoad.Save(dsKH);
    }
    public static void main(String[] args) {
        //SetupData();
        new UI().setVisible(true);
    }
    
}
