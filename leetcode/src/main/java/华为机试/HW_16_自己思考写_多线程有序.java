package 华为机试;

import java.util.*;


/**
 * 建议使用多种方式
 */
public class HW_16_自己思考写_多线程有序 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        /**
         * join方法
         * while (isAlive()) {
         *                 wait(0);
         *             }
         *
         *             只要线程活着 就会wait 阻塞
         */
        for (int i= 0; i < num; i++){

            Thread thread1 = new Thread(new Thread1());
            Thread thread2 = new Thread(new Thread2(thread1));
            Thread thread3 = new Thread(new Thread3(thread2));
            Thread thread4 = new Thread(new Thread4(thread3));

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
        }

    }

}


class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.print("A");
    }
}

class Thread2 implements Runnable{
    private Thread thread;

    public Thread2(Thread thread){
        this.thread =thread;
    }

    @Override
    public void run() {
        try {
            this.thread.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("B");
    }
}

class Thread3 implements Runnable{
    private Thread thread;

    public Thread3(Thread thread){
        this.thread =thread;
    }
    @Override
    public void run() {
        try {
            this.thread.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("C");
    }
}

class Thread4 implements Runnable {
    private Thread thread;

    public Thread4(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            this.thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("D");
    }
}