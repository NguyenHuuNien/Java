package thucHanh1;
import java.util.ArrayList;
import java.util.Scanner;
public class Bai4 {
	private static long dem = 1;
	public static void dao(int[] al) {
		int i = al.length - 1;
		while(i>0 && al[i]==2 && al[i-1]==2) {
			i--;
		}
			while(i>0 && al[i-1]==1 && al[i]==2) {
				al[i] = 1;
				al[i-1] = 2;
				dem++;
				i--;
				int[] ar = new int[al.length];
				for(int j=0;j<al.length;j++) {
					ar[j] = al[j];
				}
				dao(ar);
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu:");
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr.add(1);
		}
		if(n == 1) {
			System.out.println("1");
			System.exit(0);
		}
		while(arr.get(0)==1 && arr.get(1) ==1) {
			arr.remove(0); arr.remove(0);
			arr.add(2);
			dem++;
			Integer[] integer = new Integer[arr.size()];
			integer = arr.toArray(integer);
			int[] intArr = new int[arr.size()];
			for(int i=0;i<arr.size();i++) {
				intArr[i] = integer[i];
			}
			dao(intArr);
		}
		System.out.println(dem);
	}
}
