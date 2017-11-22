package javaexample.day13;

public class Worker implements Runnable {
    private Employee e;

    public Worker(Employee e){
        this.e = e;
    }

    @Override
    public void run() {
        e.startWork();
    }
}
