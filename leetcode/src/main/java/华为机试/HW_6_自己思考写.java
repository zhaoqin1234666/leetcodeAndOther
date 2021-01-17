package 华为机试;

import java.util.Scanner;


public class HW_6_自己思考写 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            while (str.length() > 8){
                System.out.println(str.substring(0,8));
                str = str.substring(8);
            }

            if (str.length() > 0){
                StringBuffer append = new StringBuffer(str);
                for (int i = 0; i < (8-str.length()); i++){
                    append.append("0");
                }
                System.out.println(append.toString());
            }
        }
    }


}
