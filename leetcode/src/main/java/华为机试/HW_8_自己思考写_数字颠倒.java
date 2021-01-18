package 华为机试;

import java.util.*;


public class HW_8_自己思考写_数字颠倒 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str =  reverse(num);
        System.out.println(str);
    }

    public static String reverse(int num){
        StringBuffer buffer = new StringBuffer();
        while (num != 0){
            int i = num % 10;
            num = num / 10;
            buffer.append(i);
        }
        return buffer.toString();
    }
}
