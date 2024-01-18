package ObjectClass;

import java.io.Serializable;

public class GiangVien extends People implements Serializable{
    private String TrinhDo;

    
    public GiangVien() {
        super("GV");
    }

    public GiangVien(String Name, int Tuoi,String gioiTinh ,String SoDienThoai, String QueQuan, String TrinhDo) {
        super("GV",Name, Tuoi, gioiTinh,SoDienThoai, QueQuan);
        this.TrinhDo = TrinhDo;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }
    
}
