package 多线程;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class 多线程循环打印_atomic_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int total = in.nextInt()*4;
            AtomicInteger count = new AtomicInteger(0);
            int runCount = 4;
            MyPrinter PrinterA = new MyPrinter("A",0,count,total,runCount);
            MyPrinter PrinterB = new MyPrinter("B",1,count,total,runCount);
            MyPrinter PrinterC = new MyPrinter("C",2,count,total,runCount);
            MyPrinter PrinterD = new MyPrinter("D",3,count,total,runCount);
            new Thread(PrinterA).start();
            new Thread(PrinterB).start();
            new Thread(PrinterC).start();
            new Thread(PrinterD).start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}

class MyPrinter implements Runnable{
    String letter;
    int order;
    AtomicInteger count;
    int total;
    int runCount;

    public MyPrinter(String letter, int order, AtomicInteger count, int total,int runCount){
        this.letter = letter;
        this.order = order;
        this.count = count;
        this.total = total;
        this.runCount = runCount;
    }

    @Override
    public void run(){
        while(count.get() != total){
            synchronized(count){
                if(count.get()%runCount == order){
                    System.out.print(letter);
                    count.incrementAndGet();
                    count.notifyAll();
                }
                else{
                    try{
                        count.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}