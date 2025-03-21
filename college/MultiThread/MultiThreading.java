package MultiThread;

public class MultiThreading {
    public static void main(String[] args) {
        MultiReadingThing obj = new MultiReadingThing("threadname");
        MultiReadingThing obj2 = new MultiReadingThing("threadname");
        MultiReadingThing obj3 = new MultiReadingThing("threadname");
        obj.run();
        obj2.start();
        obj3.start();
    }
    
}
