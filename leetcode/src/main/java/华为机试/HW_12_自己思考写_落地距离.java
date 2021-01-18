package 华为机试;

import java.util.Scanner;


public class HW_12_自己思考写_落地距离 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int h = sc.nextInt();
            int num = 5;
            getHeight(5, h);
        }
    }


    public static void getHeight(int num, double h) {
        double sum = 0;
        double n = h;
        for (int i = 1; i <= num; i++) {
            sum += h * 2;
            h = h / 2;
        }

    }
}