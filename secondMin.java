public class secondMin {
    public static int sMin(int[]arr){
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin = min;
                min = arr[i];
            }
            else if(arr[i]<smin && arr[i]!=min)
                smin = arr[i];

        }
        return smin;
    }
    public static void main(String[] args) {
        int []arr={4,21,33,44,55,66,77,88,99,100};
        System.out.println(arr);
        System.out.println(sMin(arr));
    }
}
