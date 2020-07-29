import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean s = true;

        for (int j = size - 1; j > 0; j--) {
            if (array[j] < array[j - 1]) {
                s = false;
                break;
            }
        }
        System.out.println(s);
    }
}