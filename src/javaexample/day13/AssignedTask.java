package javaexample.day13;

public class AssignedTask {
    public String mesg;

    public AssignedTask(final String task){
        this.mesg = task;
    }

    @Override
    public String toString() {
        return "AssignedTask{" +
                "mesg='" + mesg + '\'' +
                '}';
    }
}
