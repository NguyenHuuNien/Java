package LearnJava;
import LearnJava.Algorithm.QuickSort;
import java.util.Scanner;
import LearnJava.Algorithm.BinarySearch;
public class Ohayo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("-----------------------------");
        for (int i=1;i<=n;i++){
            System.out.print("Nhap phan tu thu "+ i +" : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-----------------------------");
        System.out.print("Nhap gia tri can tim trong mang: ");
        int x = sc.nextInt();
        System.out.println("-----------------------------");
        System.out.println(a);
        System.out.println("-----------------------------");
        QuickSort.quicksort(a, 0, n-1);
        int kq = BinarySearch.binarysearch(a, x);
        System.out.println("Gia tri "+ x+ " nam tai vi tri "+kq+" trong mang a vua nhap.");
    }
}
