
import java.util.*;

public class Sereja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        
        int left = 0, right = n - 1;
        int flag = 0;
        long sereja = 0, dima = 0;
        
        while (left <= right) {
            int pick;
            if (cards[left] > cards[right]) {
                pick = cards[left++];
            } else {
                pick = cards[right--];
            }
            
            if (flag == 0) {
                sereja += pick;
            } else {
                dima += pick;
            }
            flag = 1 - flag;
        }
        
        System.out.println(sereja);
        System.out.println(dima);
    }
}
