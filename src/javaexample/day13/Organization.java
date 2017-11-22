package javaexample.day13;

public class Organization {
    public static void main(final String ...args){
        System.out.println("Organization is started");

        AssignedTask a = new AssignedTask("Assigned jobs to all software developer");
        AssignedTask b = new AssignedTask("Discuss with director about upcoming holidays tour");

        Manager m1 = new Manager(a);
        Manager m2 = new Manager(b);


        Worker w1 = new Worker(m1);
        Worker w2 = new Worker(m2);
        Worker d = new Worker(new Director());

        Thread managerThread1 = new Thread(w1);
        Thread managerThread2 = new Thread(w2);
        Thread directorThread = new Thread(d);

        managerThread1.start();
        managerThread2.start();
        directorThread.start();

        try {
            managerThread1.join();
            managerThread2.join();
            directorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("Organization is closed");

    }
}
