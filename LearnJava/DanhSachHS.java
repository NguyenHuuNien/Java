package LearnJava;

import java.util.Scanner;

import mypack.ListST;

public class DanhSachHS {
    public static void main(String[] args) {
        String namae, banwa;
        int mssv;
        Scanner sc = new Scanner(System.in);
        int i=0;
        ListST[] a = new ListST[10];
        while (true){
            i++;
            System.out.println("Nhap thong tin: {!q --> exit}");
            System.out.print("Name: ");
            namae = sc.next();
            if (namae.equals("!q")){
                break;
            }
            System.out.print("SDT: ");
            banwa = sc.next();
            System.out.print("Mssv: ");
            mssv = sc.nextInt();

            a[i] = new ListST(namae, banwa, mssv);

        }
        System.out.println("Thong tin cua: "+ListST.daigaku);
        System.out.println("Thong tin ve lop: "+ListST.kurasisu);
        for (int  j = 0; j<ListST.total_HS; j++){
            System.out.println(a[j+1].Info());
        }
    }
}
