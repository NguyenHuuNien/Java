package thucHanh1;

import java.math.BigInteger;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger[] arr = new BigInteger[n.intValue()];
        arr[0] = BigInteger.valueOf(1);
        arr[1] = BigInteger.valueOf(2);
        for (int i = 2; i < n.intValue(); i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }
        System.out.println(arr[n.intValue() - 1]);
    }
}