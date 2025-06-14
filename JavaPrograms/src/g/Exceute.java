package g;

import java.lang.*;
import java.util.*;

class OddEven extends Thread 
{
    volatile static int counter = -1;
    int limit;

    OddEven(int limit) 
    {
        this.limit = limit;
    }

    public synchronized void odd()
     {
        while (counter < limit) 
        {
            if (counter % 2 == 1) 
            {
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                counter++;
                notifyAll();
            }
             else 
            {
                try 
                {
                    wait();
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        }
    }

    public synchronized void even()
     {
        while (counter < limit)
         {
            if (counter % 2 == 0)
             {
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                counter++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        }
    }
}

public class Execute {
    public static void main(String[] args) {
        OddEven od = new OddEven(10);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                od.odd();
            }
        });
        t1.setName("odd");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                od.even();
            }
        });
        t2.setName("even");

        t1.start();
        t2.start();
    }
}