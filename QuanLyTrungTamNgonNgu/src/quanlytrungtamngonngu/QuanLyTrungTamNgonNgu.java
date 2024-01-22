package quanlytrungtamngonngu;

import ObjectClass.GiangVien;
import ObjectClass.HocVien;
import ObjectClass.KhoaHoc;
import QuanLyUI.UI;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import saveLoad.SaveLoad;

public class QuanLyTrungTamNgonNgu {
    private static File path = new File("data.bin");
    
    private static String generateRandomDate() {
        Random random = new Random();
        int day = random.nextInt(31) + 1;
        int month = random.nextInt(12) + 1;
        int year = random.nextInt(5) + 2023;
        return String.format("%02d/%02d/%d", day, month, year);
    }
    
    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("0");
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }
    private static void SetupData(){
        List<KhoaHoc> dsKH = new ArrayList<>();
        Random random = new Random();
        String[] languages = {"Tiếng Anh", "Tiếng Việt", "Tiếng Trung", "Tiếng Hàn","Tiếng Nhật"};
        String[] nameEng = {
    "Beginner English", "Intermediate English", "Advanced English",
    "Business English", "IELTS Preparation", "TOEFL Preparation",
    "Conversation Skills", "Grammar and Vocabulary", "English Pronunciation",
    "Writing and Composition"
};
        String[] nameVie = {
    "Tiếng Việt cơ bản", "Tiếng Việt trình độ cao cấp", "Giao tiếp tiếng Việt",
    "Tiếng Việt cho người nước ngoài", "Phát âm tiếng Việt", "Ngữ pháp tiếng Việt",
    "Viết văn tiếng Việt", "Ngôn ngữ và văn hóa Việt Nam", "Tin học văn phòng tiếng Việt",
    "Kỹ năng phỏng vấn bằng tiếng Việt"
};
        String[] nameTrung = {
    "基础汉语 (Cơ bản tiếng Trung)", "进阶汉语 (Tiếng Trung nâng cao)",
    "商务汉语 (Tiếng Trung giao tiếp kinh doanh)", "HSK考试准备 (Chuẩn bị cho kỳ thi HSK)",
    "汉语发音 (Phát âm tiếng Trung)", "汉语语法 (Ngữ pháp tiếng Trung)",
    "汉字书写 (Viết chữ Hán)", "中国文化 (Văn hóa Trung Quốc)",
    "电脑中文输入 (Đánh chữ Trung Quốc trên máy tính)", "口语会话 (Kỹ năng nói tiếng Trung)"
};
        String[] nameHan = {
    "한국어 초급 (Tiếng Hàn cơ bản)", "한국어 중급 (Tiếng Hàn trung cấp)",
    "비즈니스 한국어 (Tiếng Hàn giao tiếp kinh doanh)", "TOPIK 시험 대비 (Chuẩn bị cho kỳ thi TOPIK)",
    "한국어 발음 (Phát âm tiếng Hàn)", "한국어 문법 (Ngữ pháp tiếng Hàn)",
    "한자 쓰기 (Viết chữ Hán)", "한국 문화 (Văn hóa Hàn Quốc)",
    "컴퓨터로 한국어 입력하는 방법 (Đánh chữ tiếng Hàn trên máy tính)", "회화 기술 (Kỹ năng giao tiếp)"
};
        String[] nameNhat = {
    "日本語初級 (Tiếng Nhật cơ bản)", "日本語中級 (Tiếng Nhật trung cấp)",
    "ビジネス日本語 (Tiếng Nhật giao tiếp kinh doanh)", "JLPT対策 (Chuẩn bị cho kỳ thi JLPT)",
    "日本語の発音 (Phát âm tiếng Nhật)", "日本語文法 (Ngữ pháp tiếng Nhật)",
    "漢字の書き方 (Viết chữ Hán)", "日本文化 (Văn hóa Nhật Bản)",
    "コンピュータで日本語を入力する方法 (Đánh chữ tiếng Nhật trên máy tính)", "会話スキル (Kỹ năng giao tiếp)"
};
        String[] titles = {"Tiến sĩ", "Giáo sư", "Phó giáo sư", "Giảng viên", "Thạc sĩ"};
        String[] hocLuc = {"Giỏi", "Khá", "Trung bình", "Kém", "Đang theo dõi","Đã nghỉ học"};
        String[] addresses = {"Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Nha Trang", "Hải Phòng"};
        String[] ho = {"Nguyễn","Phạm","Trần","Đinh","Phan","Đỗ","Nguyễn","Đặng","Bùi","Trương","Lê","Vũ","Võ","Hoàng","Ngô"};
        String[] tendem = {
    "Văn", "Thị", "Đức", "Hoàng", "Văn", "Thị", "Đức", "Hoàng",
    "Thành", "Thuỳ", "Thúy", "Duyên", "Bảo", "Ngọc", "Trung", "Hữu",
    "Quốc", "Hải", "Hồng", "Kim", "Minh", "Vũ", "Thành", "Ngọc",
    "Mỹ", "Nguyễn", "Văn", "Thị", "Đức", "Hoàng", "Thành", "Thuỳ",
    "Linh", "Thúy", "Duyên", "Bảo", "Ngọc", "Trung", "Hữu", "Quốc",
    "Hải", "Hồng", "Kim", "Minh", "Vũ", "Thành", "Ngọc", "Mỹ"
};
        
        String[] maleNames = {
    "Huy", "Khang", "Bảo", "Minh", "Phúc", "Anh", "Khoa", "Phát", "Đạt", "Khôi",
    "Long", "Nam", "Duy", "Quân", "Kiệt", "Thịnh", "Tuấn", "Hưng", "Hoàng", "Hiếu"
};
        String[] femaleNames = {
    "Anh", "Trang", "Linh", "Phương", "Hương", "Thảo", "Hà", "Huyền", "Ngọc", "Hằng",
    "Giang", "Nhung", "Yến", "Nga", "Mai", "Thu", "Hạnh", "Vân", "Hoa", "Hiền"
};
        String[] sex = {"Nam","Nữ"};
        
        for (int i = 1; i <= 200; i++) {
            String language = languages[random.nextInt(languages.length)];
            String tenKH = "";
            if(language.equals("Tiếng Anh")){
                tenKH = nameEng[random.nextInt(nameEng.length)];
            } else if(language.equals("Tiếng Việt")){
                tenKH = nameVie[random.nextInt(nameVie.length)];
            } else if(language.equals("Tiếng Trung")){
                tenKH = nameTrung[random.nextInt(nameTrung.length)];
            } else if(language.equals("Tiếng Hàn")){
                tenKH = nameHan[random.nextInt(nameHan.length)];
            } else if(language.equals("Tiếng Nhật")){
                tenKH = nameNhat[random.nextInt(nameNhat.length)];
            }
            int price = random.nextInt(200000) + 50000;
            String title = titles[random.nextInt(titles.length)];
            String address = addresses[random.nextInt(addresses.length)];
            int maxStudents = random.nextInt(100) + 1;
            
            String startDate = generateRandomDate();
            String gioitinh = sex[random.nextInt(sex.length)];
            String name = ho[random.nextInt(ho.length)] + " "+ tendem[random.nextInt(tendem.length)] + " " +
                    (gioitinh.equals("Nam")?maleNames[random.nextInt(maleNames.length)]:
                    femaleNames[random.nextInt(femaleNames.length)]);
            int tuoi = random.nextInt(44)+16;
            GiangVien giangVien = new GiangVien(name, tuoi, gioitinh,
                generateRandomPhoneNumber(), address, title);
            
            KhoaHoc khoaHoc = new KhoaHoc(language, tenKH, price, giangVien, maxStudents, startDate);
            
            for(int j=0; j<maxStudents; j++){
                String gioiTinhHV = sex[random.nextInt(sex.length)];
                String namehv = ho[random.nextInt(ho.length)] + " "+ tendem[random.nextInt(tendem.length)] + " " +
                    (gioiTinhHV.equals("Nam")?maleNames[random.nextInt(maleNames.length)]:
                    femaleNames[random.nextInt(femaleNames.length)]);
                int tuoiHV = random.nextInt(36)+4;
                String adrsHV = addresses[random.nextInt(addresses.length)];
                String hocLucHV = hocLuc[random.nextInt(hocLuc.length)];
                khoaHoc.addHocVien(new HocVien(namehv, tuoiHV, gioiTinhHV, generateRandomPhoneNumber(), adrsHV, hocLucHV));
            }
            
            dsKH.add(khoaHoc);
        }
        SaveLoad.Save(dsKH);
    }
    public static void main(String[] args) {
        //SetupData();
        new UI().setVisible(true);
    }
    
}
