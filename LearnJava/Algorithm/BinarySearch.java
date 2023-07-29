package LearnJava.Algorithm;
// đây là thuật toán tìm kiếm nhị phân (Binary Search)
public class BinarySearch {
    public static int binarysearch(int[] arr, int x){
        int r = 0; // diem dau cua mang
        int l = arr.length - 1; // diem cuoi cua mang, vi mang bat dau tu 0 nen diem cuoi se la do dai mang -1
        while (r <= l){ 
            int mid = (r + l)/2; // lay mid
            if (arr[mid] == x){ // tra ve mid neu tai mid gia tri bang gia tri can tim
                return mid;
            }else if(arr[mid]<x){ // neu vi tri mid hien tai nho hon gia tri can tim thi thu hep khong gian search, tinh bat dau tu mid +1 -> l
                r = mid + 1;
            }else{ // nguoc lai, neu mid lon hon gia tri can tim thi  thu hep lai, tinh bat dau tu r -> mid -1
                l = mid -1;
            }
        }
        return -1; // return -1 neu khong tim thay gia tri
    }
}
