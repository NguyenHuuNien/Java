package LearnJava;

import java.util.Scanner;

public class factorSum {
    public static boolean snt(int a){
        if (a<2){
            return false;
        }else if (a<4){
            return true;
        }else{
            for (int i = 2; i < Math.sqrt(a); i++){
                if (a%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int ptSum(int S){
        int kq = 0;
        for (int i = 2; i<=S ; i++){
            while (S%i == 0){
                kq += i;
                S /= i;
            }
        }
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Nhap N: ");
        int N = sc.nextInt();
        while (!snt(N)){
            N = ptSum(N);
        }
        System.out.println(N);
    }
}
