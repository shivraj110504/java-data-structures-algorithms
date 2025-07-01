package DevStrive.BasicMaths;

public class checkPallindrome {
    public static boolean isPallindrome(int n){
        int dup = n;
        int reverseNum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        return reverseNum == dup;
    }
    public static void main(String[] args) {
        int number = 12321;
        if(isPallindrome(number)){
            System.out.println(number + " is a pallindrome");
        } else {
            System.out.println(number + " is not a pallindrome");
        }
        
    }
}
