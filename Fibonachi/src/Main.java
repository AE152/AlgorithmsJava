//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(fibonachi_recursive(10) + " "+ fibonachi_effective(22));
    }

    public static long fibonachi_recursive(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonachi_recursive(n - 1) + fibonachi_recursive(n - 2);
    }

    public static long fibonachi_effective(int n){
        long[] arr = new long[n+2];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}