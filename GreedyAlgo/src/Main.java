import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] digits = {1, 5, 2, 3, 1, 9 ,5};
        System.out.println(MaxNumber(digits));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

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
}