package 华为机试;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(m);
        System.out.println(n);
        int [][] array = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }




    }


}
