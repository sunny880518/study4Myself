package day1;

public class arrayChange {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int index0 = 0, index1 = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if (index0 >= index1) {
                break;
            }
            int temp = arr1[index0];
            arr1[index0] = arr1[index1];
            arr1[index1] = temp;
            index0++;
            index1--;
        }
    }
}
