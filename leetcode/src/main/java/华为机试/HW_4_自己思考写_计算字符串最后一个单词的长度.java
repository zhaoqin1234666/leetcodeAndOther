package 华为机试;

import java.util.Scanner;

public class HW_4_自己思考写_计算字符串最后一个单词的长度 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO 注意 next方法并不能包容空格  解析一行数据应该使用nextLine
        String next = scanner.nextLine();
        int length = getLength(next);
        System.out.println(length);
    }

    public static int getLength(String str){
        String[] array = str.split(" ");
        String lastStr = array[array.length -1];
        return lastStr.length();
    }
}
