import java.util.*;
public class Sereja {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        int left = 0;
        int right = n - 1;
        int sereja = 0, dima = 0;
        boolean turn = true;

        while (left <= right){
            if (turn == true){
                if(array[left] > array[right]){
                    sereja += array[right];
                    left++;
                } else {
                    sereja += array[right];
                    right--;
                }
                turn = false;
            }

            if (turn == false){
                if(array[left] > array[right]){
                    dima += array[left];
                    left++;
                } else {
                    dima += array[right];
                    right--;
                }
                turn = true;
            }
        }
        System.out.println(sereja);
        System.out.println(dima);

    }
}
