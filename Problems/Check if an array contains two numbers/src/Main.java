import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        for ( ;i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean equalTo = false;
        for (int j = 0 ;j < size - 1; j++) {
            if (n == array[j]) {
                if (m == array[j + 1]) {
//                    System.out.println(true);
                    equalTo = true;
                    break;
                }
            } else if (m == array[j]) {
                if (n == array[j + 1]) {
//                    System.out.println(true);
                    equalTo = true;
                    break;
                }
            }

        }
        System.out.println(equalTo);



    }
}