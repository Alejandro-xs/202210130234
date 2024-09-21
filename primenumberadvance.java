public class primenumberadvance {
    public static void main(String[] args) {
        int limit = 20000;
        boolean[] isComposite = new boolean[limit + 1];
        int primeCount = 0; // 更具描述性的命名
        for (int i = 2; i * i <= limit; i++) {
            if (!isComposite[i]) { 
                for (int j = i * i; j < isComposite.length; j += i) { // 修正Array越界
                    isComposite[j] = true; 
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
                primeCount++;
                if (primeCount % 5 == 0) {
                    System.out.println();
                }
            }
        }
        if (primeCount % 5 != 0) {
            System.out.println();
        }
    }
}
