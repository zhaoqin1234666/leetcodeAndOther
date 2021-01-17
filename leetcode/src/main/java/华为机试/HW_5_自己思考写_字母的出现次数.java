package 华为机试;

import java.util.Scanner;


public class HW_5_自己思考写_字母的出现次数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO 注意 next方法并不能包容空格  解析一行数据应该使用nextLine
        String next = scanner.nextLine().toLowerCase();
        char s = scanner.nextLine().toLowerCase().charAt(0);
        int size = getSize(next, s);
        System.out.println(size);
    }

    public static int getSize(String str, char s){
        char[] chars = str.toCharArray();
        int size = 0;
        for (char c : chars){
            if (s == c){
                size++;
            }
        }
        return size;
    }
}
