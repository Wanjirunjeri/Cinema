import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a =scanner .nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            sum += b;
        }
        System.out.print(sum);
    }
}