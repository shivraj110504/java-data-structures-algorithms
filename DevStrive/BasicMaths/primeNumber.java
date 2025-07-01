package DevStrive.BasicMaths;

public class primeNumber {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                count++;
                if(i != n / i) {
                    count++; // Count the corresponding divisor
                }
            }
        }
        return count == 2; // A prime number has exactly two divisors: 1 and itself
    }
    public static void main(String[] args) {
        int n = 29; // Example number
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
