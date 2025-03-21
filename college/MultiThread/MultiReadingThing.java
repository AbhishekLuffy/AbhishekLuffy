package MultiThread;

public class MultiReadingThing extends Thread {
    String threadname;
    MultiReadingThing(String threadname){
        this.threadname = threadname;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(threadname+ " "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }
}
