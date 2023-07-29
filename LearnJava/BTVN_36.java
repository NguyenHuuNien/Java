package LearnJava;
import java.util.Scanner;

public class BTVN_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1,name2;
        String qq1,qq2;
        int tuoi1,tuoi2;
        name1 = sc.nextLine();
        qq1 = sc.nextLine();
        tuoi1 = sc.nextInt();
        name2 = sc.nextLine();
        qq2 = sc.nextLine();
        tuoi2 = sc.nextInt();
        System.out.println("Nhap thong tin sinh vien 1:");
        System.out.println("- Ten: "+name1);
        System.out.println("- Que quan: "+qq1);
        System.out.println("- Tuoi: "+tuoi1);
        System.out.println("Nhap thong tin sinh vien 2:");
        System.out.println("- Ten: "+name2);
        System.out.println("- Que quan: "+qq2);
        System.out.println("- Tuoi: "+tuoi2);
        System.out.println("Cac sinh vien da nhap vao:");
        System.out.println("*-----------------------------------------------*");
        System.out.println("| Ten | Que quan | Tuoi |");
        System.out.println("*-----------------------------------------------*");
        System.out.println("| "+name1+" | "+qq1+" | "+tuoi1+"|");
        System.out.println("*-----------------------------------------------*");
        System.out.println("| "+name2+" | "+qq2+" | "+tuoi2+"|");
        System.out.println("*-----------------------------------------------*");
    }
}
