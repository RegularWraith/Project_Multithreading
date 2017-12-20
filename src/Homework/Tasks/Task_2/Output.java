package Homework.Tasks.Task_2;

class Output extends Thread {
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(2000);
            }catch(InterruptedException e){}

            System.out.println("Hello, world! ");
        }
    }
}
