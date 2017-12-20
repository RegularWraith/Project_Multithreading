package Homework.Tasks.Task_4;

 class Output_1 extends Thread{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("В наступний рядок! ");
        }
    }
}
