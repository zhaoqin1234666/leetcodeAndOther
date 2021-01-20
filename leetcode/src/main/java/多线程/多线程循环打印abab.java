package 多线程;

public class 多线程循环打印abab {

    public static void main(String [] args){



        for (int i = 0; i < 10000; i++){

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("a");
                }
            });


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("b");
                }
            });


            try {
                thread1.join();
                thread1.start();
                thread2.start();
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }

}
