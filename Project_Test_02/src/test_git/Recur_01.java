package test_git;

public class Recur_01 {

    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int [] arr = {
            fibo(5),
            fibo(6),
            fibo(7)
        };
        int a = 1;
        for (Integer i : arr) {
            System.out.printf("\nFibo %dth: %d", a, i);
            a++;
        }
    }
}
