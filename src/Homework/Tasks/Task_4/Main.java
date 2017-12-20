package Homework.Tasks.Task_4;

public class Main {
    static Output newThread;
    static Output_1 newThread1;
    public static void main(String[] args) {
    newThread = new Output();
        System.out.println("Outputting...");
        newThread.start();
       for(int i = 0; i < 5; i++)
    {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){}

        System.out.println("Ета хардбасс!");
    }
        if(newThread.isAlive())
        {
            try{
                newThread.join();
            }catch(InterruptedException e){}

            newThread1 = new Output_1();
            newThread1.start();
            System.out.println("<тіпо всьо>");
        }
        else
        {
            newThread1 = new Output_1();
            newThread1.start();
            System.out.println("<тіпо всьо>");

        }
    }
}

