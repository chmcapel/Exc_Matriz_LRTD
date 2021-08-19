package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer m = sc.nextInt();
        Integer n = sc.nextInt();

        Integer[][] mat = new Integer[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        Integer x = sc.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == x) {
                    System.out.print("Position " + i + "," + j + ":");
                    System.out.println();
                    if (j-1 != -1) {
                        System.out.print("Left: "+ mat[i][j-1]);
                        System.out.println();
                    }
                    if (j+1 < mat[i].length) {
                        System.out.print("Right: "+ mat[i][j+1]);
                        System.out.println();
                    }
                    if (i-1 != -1) {
                        System.out.print("Top: "+ mat[i-1][j]);
                        System.out.println();
                    }
                    if (i+1 < mat.length) {
                        System.out.print("Down: "+ mat[i+1][j]);
                        System.out.println();
                    }
                }
            }
        }

        sc.close();
    }
}
