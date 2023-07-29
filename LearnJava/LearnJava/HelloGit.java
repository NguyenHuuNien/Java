package LearnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class HelloGit {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int cc = 0;
        int i=0;
        for(List<Integer> o : arr){
            cc+=o.get(i);
            i++;
        }
        int cp = 0;
        i=arr.size()-1;
        for(List<Integer> o: arr){
            cp+=o.get(i);
            i--;
        }
        return Math.abs(cc-cp);
    }
    public static void main(String[] args) {
        // Khởi tạo List 2 chiều và thêm các phần tử vào
        List<List<Integer>> list2D = new ArrayList<>();
        list2D.add(Arrays.asList(11, 2, 4));
        list2D.add(Arrays.asList(4, 5, 6));
        list2D.add(Arrays.asList(10, 8, -12));
        int kq = diagonalDifference(list2D);
        System.out.println(kq);
    }
}
