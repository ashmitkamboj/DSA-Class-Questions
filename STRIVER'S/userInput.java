import java.util.Scanner;
class userInput {
    public static void printNumber(Scanner sc) {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print(num1 + " " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        printNumber(sc);
    }
}