package LearnJava;

import java.util.Scanner;

public class check_Char_inString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.print("Nhap ky tu muon kiem tra: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count++;
            }
        }
        System.out.print("Ket Qua: " + count);
    }
}