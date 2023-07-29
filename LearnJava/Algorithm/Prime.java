package LearnJava.Algorithm;
import java.util.Arrays;
public class Prime {
    public static boolean prime(int N){
        if (N<2){ // neu N<2 thi chac chan khong phai so nguyen to => false
            return false; 
        }else if(N<4){ // neu N >=2 va N<4 tuc la N = 2 or N = 3 => true
            return true;
        }else{ // neu N >=4 va chia het cho bat ky so nao khac 1 va chinh no thi khong phai so nnguyen to 
            for (int i = 2; i<=Math.sqrt(N); i++){
                if (N%i==0){  // neu N chia het cho so nao khac thi return false
                    return false;
                }
            }
        }
        return true; // khong thuoc truong hop nao tren thi return true
    }
    public static void sangPrime(Boolean[] arr, int n){ // mảng để lưu lại kết qua sau khi sàng, n là số phần tử của mảng
        Arrays.fill(arr,true);  // la
        arr[0] = arr[1] = false;   
        int i = 2;
        while(i*2<=n){
            if (arr[i]==true){
                for (int j=2*i;j<=n;j+=i){
                    arr[i] = false;
                }
            }
            i++;
        }
    }
}
