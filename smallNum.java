public class smallNum {
    public static int findSmall(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { -21, -11, -1, 0, 1, 11, 22, 33, 44, 55, 66, 77, 100 };
        System.out.println(findSmall(arr));
    }
}
