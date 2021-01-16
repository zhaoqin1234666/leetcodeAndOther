package 华为机试;

import java.util.Scanner;

/**
 * Created by xuzhenyu on 2020/1/5.
 * 任给一个数组，元素有20M，1T，300G之类的，其中1T=1000G，1G=1000M
 * 按从小到大输出结果
 * 例如：输入：3
 * 20M
 * 1T
 * 300G
 * 输出：
 * 20M
 * 300G
 * 1T
 */
public class HW_1_答案 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        String[] ruslutStrs = sort(strings);
        for (int i = 0; i <ruslutStrs.length ; i++) {
            System.out.println(ruslutStrs[i]);
        }
    }
    private static String[] sort(String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = 0; j < strs.length - i - 1; j++) {
                // M G T

                if (compare(strs[j], strs[j + 1])) {
                    String tem = strs[j];
                    strs[j] = strs[j+1];
                    strs[j+1] = tem;
                }
            }
        }
        return strs;
    }
    private static boolean compare(String str1, String str2){
        int str1M = turnString(str1);
        int str2M = turnString(str2);
        return str1M>str2M;
    }
    private static int turnString(String str){
        if("M".equals(String.valueOf(str.charAt(str.length()-1)))){
            return Integer.parseInt(str.substring(0,str.length()-1));
        }
        else if ("G".equals(String.valueOf(str.charAt(str.length()-1)))){
            return Integer.parseInt(str.substring(0,str.length()-1))*1000;
        }
        else if ("T".equals(String.valueOf(str.charAt(str.length()-1)))){
            return Integer.parseInt(str.substring(0,str.length()-1))*1000000;
        }
        return 0;
    };

}