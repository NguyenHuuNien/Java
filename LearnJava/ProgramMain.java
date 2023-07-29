package LearnJava;

import java.util.Scanner;
import LearnJava.Algorithm.Prime;

public class ProgramMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so a va b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = Math.min(a,b);
        Boolean[] arr = new Boolean[n+10];    
        Prime.sangPrime(arr,n);
        for (int i = n-1; i>=2; i--){
            if (arr[i] == true && a%i==0 && b%i==0){
                System.out.println("Ket Qua: "+i);
                break;
            }
        }
    }
}