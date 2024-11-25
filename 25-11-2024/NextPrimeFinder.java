public class NextPrimeFinder {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static int findNextPrime(int number) {
            int candidate = number + 1; 
        while (true) {
            if (isPrime(candidate)) {
                return candidate; 
            }
            candidate++; 
        }
    }

    public static void main(String[] args) {
        int number = 3; 
        int nextPrime = findNextPrime(number);
        System.out.println("The next prime after " + number + " is " + nextPrime);
    }
}
