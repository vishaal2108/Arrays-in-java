public class fibonacci{
    public static int fibo(int n){
        int a =0;
        int b=1;
        for(int i=3;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(fibo(9));
    }
}