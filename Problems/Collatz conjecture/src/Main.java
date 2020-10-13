import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = n;

        while (result != 1) {
            System.out.print(result + " ");
            if (result % 2 == 0) {
                result = result / 2;
            } else {
                result = result * 3 + 1;
            }
        }
        System.out.print(result);
    }
}
