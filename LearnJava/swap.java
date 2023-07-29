package LearnJava;

public class swap {
    public static void main(String[] args) {
        int[] arr = {5, 10};
        System.out.println("Before swapping: a = " + arr[0] + ", b = " + arr[1]);
        swap(arr);
        System.out.println("After swapping: a = " + arr[0] + ", b = " + arr[1]);
    }

    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
