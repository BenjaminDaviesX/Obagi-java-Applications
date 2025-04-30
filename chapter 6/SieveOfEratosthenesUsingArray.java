public class SieveOfEratosthenesUsingArray {
    public static void main(String[] args) {
        int size = 1000;
        boolean[] isPrime = new boolean[size]; // Step (a): Create array

        
        for (int i = 2; i < size; i++) {  // Step (a): Initialize all elements to true (except 0 and 1)
            isPrime[i] = true;
        }

       
        for (int num = 2; num * num < size; num++) {  // Step (b): Apply the sieve method
            if (isPrime[num]) { 
                for (int multiple = num * num; multiple < size; multiple += num) {
                    isPrime[multiple] = false;
                }
            }
        }

        
        System.out.println("Prime numbers between 2 and 999:"); // Step (c): Display prime numbers
        for (int i = 2; i < size; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
