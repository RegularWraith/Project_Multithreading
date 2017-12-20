package Homework.Tasks.Task_1;

public class Main {
    static Output newThread;
    public static void main(String[] args) {
        newThread = new Output();
        System.out.println("Outputting...");
        newThread.start();
    }
}
