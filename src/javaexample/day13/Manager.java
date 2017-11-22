package javaexample.day13;

public class Manager extends Employee {
    private AssignedTask task;

    public Manager(final AssignedTask task){
        this.task = task;
    }

    @Override
    void startWork() {
        System.out.println("Manager at work, todays task: " + task);
    }
}
