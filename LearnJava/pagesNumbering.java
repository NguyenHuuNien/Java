package LearnJava;

import java.lang.Math;
import java.util.Scanner;


public class pagesNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kq=0;
        int temp=0;
        int scs = String.valueOf(n).length();
        if(n<=9){
            System.out.println(n);
        }else{
            for(int i=1;i<scs;i++){
                kq+=9*Math.pow(10,i-1)*i;
                temp+=9*Math.pow(10,i-1);
            }
            kq += ( n - temp ) * scs;
        }
        System.out.println(kq);
    }
}
