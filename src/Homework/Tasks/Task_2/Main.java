package Homework.Tasks.Task_2;

public class Main {
    static Output newThread;
    public static void main(String[] args) {
        newThread = new Output();
        System.out.println("Outputting...");
        newThread.start();
        for(int i = 0; i < 5; i++)
        {
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){}

            System.out.println("Peace in the world!");
        }

        System.out.println("My name JEFF!");
       }
}