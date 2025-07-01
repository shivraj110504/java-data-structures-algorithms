package DevStrive.BasicMaths;

public class countDigits {
    public static int count(int n){
        int count = 0;
        while(n>0){
            int lastDigit = n% 10;
            count++;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is: " + count(n));
    }
}
