package 华为机试;



import java.util.*;



public class HW_20_自己思考写_只出现一次字符 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();

            Map<Character, Integer> map = new HashMap<>();
            char[] chars = str.toCharArray();

            for (char c : chars) {
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            }

            boolean flag = false;
            for (char c : chars) {
                if (map.get(c) == 1) {
                    flag = true;
                    System.out.println(c);
                    break;
                }
            }

            if (!flag) {
                System.out.println(-1);
            }
        }

    }

}