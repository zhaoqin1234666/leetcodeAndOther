package 华为机试;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
