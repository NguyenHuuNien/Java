package oop_pnk;

import java.util.Scanner;

public class OOP_PNK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Tong: " + (x+y));
        System.out.println("Hieu: " + (x-y));
        System.out.println("Tich: " + (x*y));
        System.out.println("Thuong: " + (x/y));
        System.out.println("Thuong: " + ((double)x/y));
    }
}
