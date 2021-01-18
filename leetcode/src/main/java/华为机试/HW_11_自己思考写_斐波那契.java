package 华为机试;

import java.util.Scanner;


public class HW_11_自己思考写_斐波那契 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //TODO 递归
//        int i = get(num);
        //TODO 不递归
        int i = get2(num);
        System.out.println(i);
    }

    /**
     * 方法一 递归  时间复杂度0(2^n) 空间复杂度 o(n)
     *
     * @param num
     * @return
     */
    public static int get(int num){
        if (num == 1 || num == 2){
            return 1;
        } else {
            return get(num-1) + get(num-2);
        }
    }

    /**
     * 1 1 2
     * @param num
     */
    public static int get2(int num){
        if (num < 3){
            return 1;
        } else {
            int m = 1;
            int n = 1;
            for (int k = 3; k <= num; k++){
                int temp = m + n;
                m = n;
                n = temp;
            }
            return n;
        }
    }





}
