package 华为机试;

import java.math.*;
import java.util.*;


/**
 * 建议使用多种方式
 */
public class HW_19_自己思考写_高精度整数加法 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        System.out.println(bigA.add(bigB));
    }

}


