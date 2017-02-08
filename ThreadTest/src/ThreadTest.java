/**
 * Created by Sakkar on 2/8/2017.
 */
public class ThreadTest {
    public static void main(String[] args){
        MyThread thread1=new MyThread("Thread 1");
        MyThread thread2=new MyThread("Thread 2");
        MyThread thread3=new MyThread("Thread 3");
        try {
            thread1.start();
            thread2.start();
            thread3.start();
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}
