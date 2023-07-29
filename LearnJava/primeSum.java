import java.util.ArrayList;
import java.util.Scanner;

public class primeSum {
    public static boolean[] sang (int n){
        boolean[] arrB = new boolean[n];
        for(int i=0;i<n;i++){
            arrB[i] = true;
        }
        arrB[0] = false;
        arrB[1] = false;
        for(int i=2;i<n;i++){
            if(arrB[i]){
                for(int j=i*2;j<n;j+=i){
                    arrB[j]=false;
                }
            }
        }
        return arrB;
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        n++;
        boolean[] arrS = sang(n);
        int mod = 22082018;
        int sum = 0;
        for(int i=2;i<n;i++){
            System.out.println(i);
            if(arrS[i]){
                System.out.println(i+"+"+arrS[i]);
                sum=(sum+i%mod)%mod;
            }
        }
        System.out.println(sum);
    }
}
