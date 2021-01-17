package 华为机试;

import java.util.Scanner;


public class HW_7_自己思考写_质数因子 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 1){
            for (int i = 2; i <= num; i++){
                if (num%i == 0){
                    System.out.print(i+" ");
                    num = num/i;
                    break;
                }
            }
        }
    }


}
