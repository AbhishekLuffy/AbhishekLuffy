package MultiThread.EvenOddMultiThread;

public class Odd extends Thread {
    int n = 20;
    @Override
    public void run(){
        for(int i = 0 ; i < n ; i++){
            if(i % 2 != 0){
                try{
                    System.out.println("odd: " + i);
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
    
}

