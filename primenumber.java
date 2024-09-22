public class primenumber {
            public static void main(String[] args) {
            int limit = 20000;
            int count = 0; 
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 5 == 0) { 
                        System.out.println();
                    }
                }
            }
            if (count % 5 != 0) {
                System.out.println();
            }
        }
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
