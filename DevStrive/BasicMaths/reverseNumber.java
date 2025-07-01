package DevStrive.BasicMaths;

public class reverseNumber {
    public static int reverse(int n){
        int reverseNum = 0;
        while(n> 0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        return reverseNum;
    }
    public static void main(String[] args) {
        int number = 1324343;
        System.out.println(number);
        System.out.println(reverse(number)+ " is the reverse ");
    }
}
