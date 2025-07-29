import java.util.Scanner;

public class secondLargest {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2){
            return -1;
        } 
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        secondLargest obj = new secondLargest();
        int result = obj.getSecondLargest(arr);
        System.out.println("Second Largest Element: " + result);
    }
}
