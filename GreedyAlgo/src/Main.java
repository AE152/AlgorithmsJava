import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = {1, 5, 2, 3, 1, 9 ,5};
        System.out.println(MaxNumber(digits));

        int[] stations = {0, 50, 250, 600, 700, 1000};
        int reservePower = 400;
        System.out.println(MinRefil(stations, reservePower));

    }

    //Составляет максимальное число из массива цифр за O(n*log(n))
    public static String MaxNumber(int[] digits){
        Arrays.sort(digits);
        String res = "";
        for(int i = digits.length - 1; i >= 0; i--){
            res += digits[i];
        }
        return res;
    }

    //Возвращает минимально необходимое количество заправок для поездки
    public static int MinRefil(int[] stations, int reservePower){
        int currentState = 0;
        int nextState = 0;
        int result = 0;
        while(currentState < stations.length - 1 ){

            while(nextState < stations.length - 1 &&
                    stations[nextState + 1] - stations[currentState] <= reservePower){
                nextState++;
            }
            if(nextState != stations.length - 1)
                result++;
            currentState = nextState;
        }
        return result;
    }
}