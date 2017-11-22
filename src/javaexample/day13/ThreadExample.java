package javaexample.day13;

// Thread -> part of main program that does some task
// implement runnable interface ( implement run method)
// Thread class extend (already implements runnable interface )
// To start the thread call start method that in turn calls run method with newly created thread.


// Employee ( abstract class, abstract method startWork)
// Manager extends Employee startWork ( implements startWork method)
// Reciptionis extends Employee work (implements startWork method)
// Worker implements Runnable ( private Employee e (attribute))
// public Worker(Employee e){this.e = e;}
// public void run(){e.startWork();}

public class ThreadExample implements Runnable{
    private String mesg;

    public ThreadExample(final String mesg){
        this.mesg = mesg;
    }
    @Override
    public void run() {
        System.out.println("My Task: " + mesg);
    }


    public static void main(final String ...args){
        System.out.println("main thread running");

        final ThreadExample th1 = new ThreadExample("Bring Biryani");
        new Thread(th1).start();

        final ThreadExample th2 = new ThreadExample("Cool poolau");
        new Thread(th2).start();

        for(int i =1;i<10000;i++) {
            //System.out.println("main thread exiting");
        }
        System.out.println("main thread exiting");
    }
}
