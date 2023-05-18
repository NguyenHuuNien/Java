package ai_data;
import java.util.Scanner;

public class Tinh_sai_so {
	public static void tinhToan() {
		System.out.print("Nhap n: ");
		int n = new Scanner(System.in).nextInt();
		double tbX = 0;
        double tbY = 0;
        Scanner sc = new Scanner(System.in);
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
        System.out.println("B0 = "+B0);
        double[] Ypred = new double[n];
        System.out.print("Co can nhap Ypred(Y^) khong? (1(co)/0(khong))");
        int choose = new Scanner(System.in).nextInt();
        if (choose == 0) {
        	for (int i=0;i<n;i++) {
            	Ypred[i] = B0 + B1 * x[i];
            }
        }
        else {
        	System.out.println("Moi nhap Ypred(Y^):");
        	for(int i=0;i<n;i++) {
        		Ypred[i] = new Scanner(System.in).nextDouble();
        	}
        }
        double MAE=0, MSE = 0;
        for (int i=0;i<n;i++) {
        	MAE += Math.abs(y[i] - Ypred[i]);
        	MSE += Math.pow(y[i] - Ypred[i],2);
        }
        MAE = MAE/n;
        MSE = MSE/n;
        double RMSE = Math.sqrt(MSE);
        System.out.println("MAE: "+MAE);
        System.out.println("MSE: "+MSE);
        System.out.println("RMSE: "+RMSE);
        double SSR=0, SST =0;
        for(int i=0;i<n;i++) {
        	SSR = Math.pow(Ypred[i] - tbY,2);
        	SST = Math.pow(y[i]-tbY,2);
        }
        double R2 = SSR/SST;
        System.out.println("R^2 = "+R2);
	}
}
