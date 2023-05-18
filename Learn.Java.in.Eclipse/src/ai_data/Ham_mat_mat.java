package ai_data;
import java.util.Scanner;

public class Ham_mat_mat {
	public static void tinhToan() {
		int n;
        double tbX = 0;
        double tbY = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double [n];
        System.out.println("Nhap x:");
        for(int i=0;i<n;i++){
            x[i] = sc.nextDouble();
            tbX+=x[i];
        }
        tbX = tbX/n;
        System.out.println("Nhap y:");
        for(int i=0;i<n;i++){
            y[i] = sc.nextDouble();
            tbY+=y[i];
        }
        tbY = tbY/n;
        double SSxy=0;
        double SSx=0;
        for(int i=0;i<n;i++){
            SSxy+=(x[i]-tbX)*(y[i]-tbY);
            SSx+=(x[i]-tbX)*(x[i]-tbX);
        }
        double B1 = SSxy/SSx;
        double B0 = tbY - B1*tbX;
        System.out.println("SSxy = "+SSxy);
        System.out.println("SSx = "+SSx);
        System.out.println("B1 = "+B1);
        System.out.println("B00 = "+B0);
        System.out.println("Phuong trinh co dang: y = B0 + B1.x");
//        System.out.println(Y);
	}
}
