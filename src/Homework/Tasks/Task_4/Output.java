package Homework.Tasks.Task_4;

 class Output extends Thread{
    @Override
    public void run()
    {
        for(int i = 0; i < 15; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("Раз ");
        }
    }
}
