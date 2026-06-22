public class fibonacciSeries {
    public static void fibos(int n){
        int a =0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        fibos(9);
    }
}
