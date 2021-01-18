package 华为机试;

public class Test {

    public static void main(String[] args) {

        while(true){
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
               if (i == 5){
                   return;
               }
            }
        }
    }


}
