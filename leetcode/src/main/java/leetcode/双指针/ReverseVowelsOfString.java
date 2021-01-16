package com.yunheit.icard.web.controller;

import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfString {

    public static void main(String [] args){
        String string = "leetcode";
        String str = reverse(string);
        System.out.println(str);
    }

    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        String yuanyin = "a,e,i,o,u,A,E,I,O,U";
        List<String> yuanyinlist = Arrays.asList(yuanyin.split(","));

        while(i < j){

            String iStr = String.valueOf(s.charAt(i));
            String jStr = String.valueOf(s.charAt(j));

            if (yuanyinlist.contains(iStr) && yuanyinlist.contains(jStr)){
                char temp;
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (yuanyinlist.contains(iStr) && !yuanyinlist.contains(jStr)){
                j--;
            } else if (!yuanyinlist.contains(iStr) && yuanyinlist.contains(jStr)){
                i++;
            } else {
                i++; j--;
            }
        }
        return new String(chars);
    }
}
