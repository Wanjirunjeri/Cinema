import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int X = (B - A) + 1;
        int [][] array = new int[X][N];
        int [] maxlist = new int [X];
        int d = A;


        for (int i = 0; i < X; i++) {
            Random random = new Random(d);
            int max = 0;

            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(K);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxlist[i] = max;
            d++;
        }

        int min = 0;
        for (int i = 0; i < maxlist.length; i++) {
            if (maxlist[i] >= min && i == 0) {
                min = maxlist[i];
            } else if (maxlist[i] < min) {
                min = maxlist[i];
            }
        }
        int Z = 0;
        for (int i = 0; i < maxlist.length; i++) {
            if (maxlist[i] == min) {
                Z = i + A;
                break;
            }
        }
        System.out.println(Z);
        System.out.println(min);
    }
}
