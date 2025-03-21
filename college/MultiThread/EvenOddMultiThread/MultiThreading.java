package MultiThread.EvenOddMultiThread;

public class MultiThreading {
        public static void main(String[] args) {
        Even obj = new Even();
        Odd obj2 = new Odd();
        obj.run();
        obj2.start();
    }
    
}

