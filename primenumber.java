public class primenumber {
    

        public static void main(String[] args) {
            int limit = 20000;
            int count = 0; // 用于跟踪每行打印的素数数量
    
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 5 == 0) { // 每打印5个素数换一行
                        System.out.println();
                    }
                }
            }
            // 如果最后一行没有满5个素数，则打印换行
            if (count % 5 != 0) {
                System.out.println();
            }
        }
    
        // 判断一个整数n是否是素数
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
