import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] mat = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                if(mat[i][j] == number){
                    System.out.println("Position: " + i + "," + j);
                    if(j - 1 >= 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if(j + 1 < y){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if(i - 1 >= 0){
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if(i + 1 < x){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}