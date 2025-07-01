package DevStrive.BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class printAllDicisor {
    public static void divisor(int n){
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                divisors.add(i);
                if(i != n / i) { // To avoid adding the square root twice
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors); // Sort the divisors in ascending order
        System.out.println("Divisors of " + n + " are: " + divisors);
    }
    public static void main(String[] args) {
        int number = 28; // Example number
        divisor(number);
    }
}
