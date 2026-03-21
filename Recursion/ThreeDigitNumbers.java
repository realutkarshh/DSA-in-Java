import java.util.ArrayList;
import java.util.Collections;

public class ThreeDigitNumbers {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        findEvenNumbers(digits);
    }

    public static ArrayList<Integer> findEvenNumbers(int[] digits){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < digits.length; i++){
            for(int j = 0; j < digits.length; j++){
                for(int k = 0; k < digits.length; k++){
                    if(i == j || j == k || i == k){
                        continue;
                    }
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k] * 1;
                    if(num > 100 && num%2 == 0){
                        result.add(num);
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
