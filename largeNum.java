class largeNum {
    public static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
        System.out.println(findmax(arr));
    }
}
