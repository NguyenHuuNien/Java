package LearnJava;
import java.util.Scanner;
public class digitsProduct {

    public static int product(int n){
        int res = 0;
        if (n==1){
            return 0;
        }
        if (n==0){
            return 10;
        }
        for (int i=9;i>=2;i--){
            while(n % i ==0){
                res = res * 10 + i;
                n /=i;
            }
        }
        int res2 = 0;
        while (res>0){
            res2 = (res2*10)+(res%10);
            res/=10;
        }
        return (n==1)?res2:-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(product(a));
    }
}
