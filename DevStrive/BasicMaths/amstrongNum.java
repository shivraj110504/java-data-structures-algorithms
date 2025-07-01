package DevStrive.BasicMaths;

public class amstrongNum {
    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit; // For 3-digit Armstrong numbers
            n = n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        int number = 153; // Example number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

// armstrong number is the number equal to sum of each digit cube
