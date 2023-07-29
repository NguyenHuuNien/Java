package LearnJava.Algorithm;

public class QuickSort {
    public static void quicksort(int[] arr, int low, int high){
        if (low < high){ // low = high thì chỉ còn 1 lần tử nên ko cần xét nữa. chỉ xét khi nào low còn nhỏ hơn high
            int pivot_index = partition(arr,low,high); // qua hàm partition, chọn 1 pivot để chia đôi mảng ra xét
            quicksort(arr,low,pivot_index-1); // xét phần từ low -> pivot
            quicksort(arr, pivot_index+1, high); // xét từ pivot -> high
        }
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; // chọn 1 pivot, ở đây chọn thằng cuối của mảng con đang xét
        int i = low - 1; // i thể hiện cho vị trí hiện đang nhỏ hơn pivot, i+1 sẽ đc coi là lớn hơn pivot
        for (int j = low; j<high; j++){ // xét full mảng con đang xét, ngoại trừ thằng cuối (vì j chỉ < high, chứ ko phải <= high) vì tại vị trí high đã được chọn làm pivot
            if (arr[j]<=pivot){ // khi thằng xét đến <= pivot, đổi vị trí của nó vs i+1 
                i+=1; // tăng i, lúc này i đang ở vị trí đc coi là lớn hơn pivot. sau đó đổi vị trí thằng đang xét vs vị trí này. Vì j là biến chạy nên j luôn >= i. biến j sẽ đc dùng để dò tìm xem thằng nào nhỏ hơn pivot rồi hoán đổi lại vs thằng đc coi là lớn hơn pivot. sau khi biến đổi, vị trí i sẽ là vị trí <= pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            // sau khi xét xong, đổi vị trí i+1 vs pivot (tức arr[high]). vì i là vị trí <= pivot, i+1 là vị trí > pivot
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }        
}
