package ObjectClass;

public class GiangVien extends People{
    private String TrinhDo;

    public GiangVien(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public GiangVien(String Name, int Tuoi, String SoDienThoai, String QueQuan, String TrinhDo) {
        super(Name, Tuoi, SoDienThoai, QueQuan);
        this.TrinhDo = TrinhDo;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }
    
}
