import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int count = 0;
        String end = new String("end");
        while (true) {
            String s = scanner.nextLine();
            if (s.equals(end)) {
                break;
            } else {
                count++;
                input += s + "\n";
            }
        }
//        System.out.println(input);
        String[] arr1 = input.split("\\s");

        int[][] arr2 = new int[count][arr1.length];
        int k = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arr1.length / count; j++) {
                arr2[i][j] = Integer.parseInt(arr1[k]);
                k++;
            }
        }
        int jei = arr1.length / count;


        int[][] copy = new int[count][jei];
        int a;
        int b;
        int c;
        int d;
        int result = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < jei; j++) {
                if (i - 1 < 0) {
                    a = arr2[count - 1][j];
                } else {
                    a = arr2[i - 1][j];
                }

                if (i + 1 > count - 1) {
                    b = arr2[0][j];
                } else {
                    b = arr2[i + 1][j];
                }

                if (j - 1 < 0) {
                    c = arr2[i][jei - 1];
                } else {
                    c = arr2[i][j - 1];
                }
                if (j + 1 > jei - 1) {
                    d = arr2[i][0];
                } else {
                    d = arr2[i][j + 1];
                }

                result = a + b + c + d;
                copy[i][j] = result;
                System.out.print(copy[i][j] + " ");

            }
            System.out.println();

        }
    }
}
