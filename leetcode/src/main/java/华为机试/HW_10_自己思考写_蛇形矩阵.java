package 华为机试;

import java.util.Scanner;


public class HW_10_自己思考写_蛇形矩阵 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        generateArray(num);
    }

    /**
     * 找规律   第一行 1 1+2 1+2+3 1+2+3+4
     * @param num
     */
    public static void generateArray(int num){
        int[][] arrays = new int[num][num];
        for (int i = 0; i < num; i++){
            for (int j=0; j < num; j++){
                if (i==0){
                    arrays[i][j] = sum(j);
                    System.out.print(sum(j) + " ");
                } else {
                    if (i-1 >= 0 && j >= 0 && i < num && j+1 < num && arrays[i-1][j+1] != 0){
                        int k = arrays[i-1][j+1] - 1;
                        arrays[i][j] = k;
                        System.out.print(k+ " ");
                    }
                }
            }
            System.out.println();

        }
    }

    public static int sum(int num){
        num = num+1;
        int sum = 0;
        for (int i=1; i <= num; i++){
            sum += i;
        }
        return sum;
    }


}
