import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}