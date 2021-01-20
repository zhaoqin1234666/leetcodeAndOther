package 华为机试;

import java.util.*;


public class HW_15_自己思考写_括号匹配 {


    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        isValid(str);
    }


    public static boolean isValid(String s) {

        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == '[' || array[i] == '{') {
                stack.add(array[i]);
            } else {

                if (   stack.size() > 0 && ((array[i] == ')' && stack.pop() == '(') ||
                        (array[i] == '}' && stack.pop() == '{') ||
                        (array[i] == ']' && stack.pop() == '['))
                ) {
                    continue;
                } else {
                    flag = false;
                    return false;
                }
            }
        }

        if (stack.size() != 0){
            return false;
        }
        return true;

    }



}