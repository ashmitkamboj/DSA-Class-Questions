import java.util.*;
public class secret_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0){
            long n = sc.nextLong();
            List<Long> result = new ArrayList<>();
           
            long pow10 = 10;
            while (pow10 < n){
                long divisor = 1 + pow10;
                if (n % divisor == 0) {
                    long x = n / divisor;
                    result.add(x);
                }

                if(pow10 > n / 10) break;
                pow10 *= 10;
            }
            if (result.isEmpty()) {
                System.out.println(-1);
            } else {
                Collections.sort(result);
                for (Long num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
