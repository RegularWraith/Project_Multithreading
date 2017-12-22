package Homework.Tasks.Task_5;

public class One {
    static Two newThread;

    public static void main(String[] args) {

        System.out.println("Thread number two!");
            newThread = new Two();
            newThread.start();
    }
}