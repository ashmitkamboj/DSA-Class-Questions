public class NoOfWays {
    public static int numberOfWays(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return numberOfWays(m - 1, n) + numberOfWays(m, n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner 
        scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        System.out.println("Number of ways to reach the bottom-right corner: " + numberOfWays(m, n));
        scanner.close();
    }
}
