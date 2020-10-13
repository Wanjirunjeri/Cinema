package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String symbols = scanner.next();
        String[] arr1 = symbols.split("(?!^)");

//        System.out.println(Arrays.toString(arr1)); // delete this!

        String[][] array = new String[3][3];
        int k = 0;
        int y = 0; // number of x's
        int z = 0; // number of 0's
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|" + " ");
            for (int j = 0; j < 3; j++) {
                if (arr1[k].equals("_")) {
                    array[i][j] = " ";
                } else {
                    array[i][j] = arr1[k];
                    if (array[i][j].equals("X")) {
                        y++;
                    } else if (array[i][j].equals("O")) {
                        z++;
                    }
                }
                k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
//        System.out.println(y); // delete
//        System.out.println(z); //delete

        String[][] arr2 = new String[3][3];

        int f = 2;
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = array[f][j];
//                System.out.print(arr2[i][j] + " ");
            }
            f--;
//            System.out.println();
        }

        boolean stop = true;
        while (stop) {
            System.out.println("Enter the coordinates: ");
//            String[] input = new String[2];
//            String a = scanner.next();
//            String[] input = a.split("\\s");
//            System.out.println(a + " " + b); //delete

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] input = new String[2];

            try {
                input = in.readLine().split(" ");

                int num1 = Integer.parseInt(input[0]);
                int num2 = Integer.parseInt(input[1]);
                if(num1 > 3 || num1 < 1 || num2 > 3 || num2 <1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                } else {
                    if (!arr2[num2 - 1][num1 - 1].equals(" ")) {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    } else {
                        if (z < y) {
                            arr2[num2 - 1][num1 - 1] = "O";
                            z++;
                        } else {
                            arr2[num2 - 1][num1 - 1] = "X";
                            y++;
                        }
                        int w = 2;
                        System.out.println("---------");
                        for (int i = 0; i < 3; i++) {
                            System.out.print("|" + " ");
                            for (int j = 0; j < 3; j++) {
                                array[i][j] = arr2[w][j];
                                System.out.print(array[i][j] + " ");
                            }
                            w--;
                            System.out.print("|");
                            System.out.println();
                        }
                        System.out.println("---------");
                    }

                }

                int m = 0;
                int n = 0;
                int c =0;
                int d =0;
                int blanks = 0;


                boolean breaks = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == 0) {
                            c = 1;
                            d = 2;
                        } else if (i == 1) {
                            c = 0;
                            d = 2;
                        } else if (i == 2) {
                            c = 1;
                            d = 0;
                        }
                        if (j == 0) {
                            m = 1;
                            n = 2;
                        } else if (j == 1) {
                            m = 0;
                            n = 2;
                        } else if (j == 2) {
                            m = 1;
                            n = 0;
                        }

                        if (arr2[i][j].equals(" ")) {
                            blanks++;
                        }


                        if (arr2[i][j].equals("X") && arr2[i][m].equals("X") && arr2[i][n].equals("X")
                                || arr2[i][j].equals("X") && arr2[c][j].equals("X") && arr2[d][j].equals("X")
                                || arr2[0][0].equals("X") && arr2[1][1].equals("X") && arr2[2][2].equals("X")
                                || arr2[0][2].equals("X") && arr2[1][1].equals("X") && arr2[2][0].equals("X")) {
                            System.out.println("X wins");
                            stop = false;
                            breaks = false;
                            break;

                        } else if (arr2[i][j].equals("O") && arr2[i][m].equals("O") && arr2[i][n].equals("O")
                                || arr2[i][j].equals("O") && arr2[c][j].equals("O") && arr2[d][j].equals("O")
                                || arr2[0][2].equals("O") && arr2[1][1].equals("O") && arr2[2][0].equals("O")
                                ||  arr2[0][0].equals("O") && arr2[1][1].equals("O") && arr2[2][2].equals("O")) {
                            System.out.println("O wins");
                            stop = false;
                            breaks = false;
                            break;
                        }
                    }

                    if(!breaks) {
                        break;
                    }
                }

                while (stop){

                    if (blanks != 0) {
                        System.out.println("Game not finished");
                        stop = false;
                        break;
                    }

                    if (y + z == 9 && blanks == 0) {
                        System.out.println("Draw");
                        stop = false;
                        break;
                    }

                }

            } catch (NumberFormatException | IOException e) {
                System.out.println("You should enter numbers!");
                    continue;


            }
        }

    }

}
