package LearnJava;
import LearnJava.Algorithm.QuickSort;
import java.util.Scanner;
import LearnJava.Algorithm.BinarySearch;

public class test_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("-----------------------------");
        for (int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+ (i+1) +" : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-----------------------------");
        System.out.print("Nhap gia tri can tim trong mang: ");
        int x = sc.nextInt();
        System.out.println("-----------------------------");
        QuickSort.quicksort(a, 0, n-1);
        System.out.println("Mang sau khi sap xep:");
        System.out.print("a = [");
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println("]");
        System.out.println("-----------------------------");
        int kq = BinarySearch.binarysearch(a, x);
        if (kq == -1){
            System.out.println("Khong co gia tri "+x+" nao trong mang. Vui long kiem tra lai.");
        }else{
            System.out.println("Gia tri "+ x+ " nam tai vi tri thu "+kq+" trong mang a vua nhap.");
        }
    }    
}
