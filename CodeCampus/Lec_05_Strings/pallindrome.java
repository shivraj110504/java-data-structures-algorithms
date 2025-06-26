package CodeCampus.Lec_05_Strings;

public class pallindrome {
    public static boolean isPallindrome(String str){
        int n = str.length();
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "racecar";
        if(isPallindrome(str)){
            System.out.println(str + " is a pallindrome");
        } else {
            System.out.println(str + " is not a pallindrome");
        }
    }
}
