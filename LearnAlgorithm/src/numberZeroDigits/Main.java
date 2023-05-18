package numberZeroDigits;

import java.util.Scanner;

/*
 * Link: https://codelearn.io/learning/thuat-toan-can-ban/2695
 * Hãy tính số chữ số 0 tận cùng của n! 
 */

public class Main {

	public static long xuly(long n) {
		// khởi tạo biến lưu trữ số lượng số 0 ở cuối
		long d = 0;
		/* cứ 2 * 5 = 10 => được thêm một số 0, mà số lũy thừa nguyên tố
		 của 2 lớn hơn 5, nên lấy 5.*/
		long k = 5;
		while(k<=n) { 
			/* n / k => đây là  số lần mà k xuất hiện như một thừa 
			số trong phân tích thành thừa số nguyên tố của n!*/
			d += n / k;
			// nhân vs 5 để di chuyển đến lũy thừa tiếp theo
			k*=5;
		}
		return d;
	}
	
	public static void main(String[] args) {
		long n = new Scanner(System.in).nextInt();
		long kq = xuly(n);
		System.out.println(kq);
	}

}
