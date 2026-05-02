class PrimeOptimized {
    public static void main(String[] args) {
        int n = 29;

        if(n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}