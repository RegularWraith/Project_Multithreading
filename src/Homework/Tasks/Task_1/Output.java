package Homework.Tasks.Task_1;

class Output extends Thread{
        @Override
        public void run()
        {
            for(int i = 0; i < 10; i++)
            {
                try{
                    sleep(1000);
                }catch(InterruptedException e){}

                System.out.println("I study Java! ");
            }
        }
    }
