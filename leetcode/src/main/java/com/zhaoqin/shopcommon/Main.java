package com.zhaoqin.shopcommon;

import java.util.*;
public class Main {

    public static int [] memory = new int[100];
    public static int [] flag = new int[100];
    private static Map<Integer,Integer> map = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++){
            String s = scanner.next();
            int a = Integer.valueOf(s.substring(8, s.length()));
            if (s.contains("REQUEST")){
                bb(a);
            } else if (s.contains("RELEASE")){
                cc(a);
            }
        }
    }

    public static void cc(int index){
       if (map.containsKey(index)){
           int j = map.get(index);
           for (int i = index; i < j; i++){
               memory[i] = 0;
               flag[i] = 0;
           }
           map.remove(index);
       } else {
           System.out.println("error");
       }
    }

    public static void bb(int size){
        int i = 0;
        while (i < 100 && i+size < 100){
            boolean aTrue = isTrue(i, i + size);
            if (aTrue){
                System.out.println(i);
                return;
            }
            i++;
        }
        System.out.println("error");
    }

    public static boolean isTrue(int m, int n){
        boolean fl = false;
        for (int i = m; i < n; i++){
            if (memory[i] == 0 && flag[i] == 0){
                fl = true;
                continue;
            } else {
                fl = false;
                return false;
            }
        }
        if (fl){
            for (int i = m; i < n; i++){
                memory[i] = 1;
                flag[i] = 1;
            }
            map.put(m,n);
        }
        return true;

    }

}