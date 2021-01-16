package 华为机试;

import org.omg.CORBA.INTERNAL;

import java.util.Objects;
import java.util.Scanner;

public class HW_1_自己思考写 {


    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        //输入整数
        int n = scanner.nextInt();
        String[] arrays = new String[n];
        for (int i = 0; i < n; i++){
            String str = scanner.next();
            arrays[i] = str;
        }

        String[] sortArray = sort(arrays);
        for (String s : sortArray){
            System.out.println(s);
        }
    }

    public static String[] sort(String[] array){
        for (int i=array.length-1; i > 0; i--){
            for (int j = 0; j < i; j ++){
                if (convert(array[j]) > convert(array[j+1] )){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int convert(String s){
        String lastStr = s.substring(s.length() - 1);
        String numStr = s.substring(0, s.length() - 1);
//        System.out.println(lastStr);
        int num = 0;
        if (Objects.equals(lastStr.toUpperCase(), "T")){
            num = Integer.valueOf(numStr) * 1000 * 1000;
        } else if (Objects.equals(lastStr.toUpperCase(), "G")){
            num = Integer.valueOf(numStr) * 1000;
        } else if (Objects.equals(lastStr.toUpperCase(), "M")){
            num = Integer.valueOf(numStr);
        }
        return num;
    }
}
