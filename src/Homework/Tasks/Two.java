package Homework.Tasks.Task_5;

public class Two extends Thread{
    static Three newThread;
        @Override
        public void run()
        {
            for(int i = 0; i < 3; i++)
            {
                try{
                    sleep(1000);
                }catch(InterruptedException e){}

                System.out.println("Thread number two!");
            }
            newThread = new Three();
            newThread.start();
        }
    }
