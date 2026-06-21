public class spyNum {
    public static boolean spy(int []arr){
        int sum =0;
        int mul =1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            mul*=arr[i];
        }
        return sum == mul;
    }
    public static void main(String[] args) {
        int arr []={1,2,3};
        System.out.println(spy(arr));
    }
}
