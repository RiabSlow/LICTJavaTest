/**
 * Created by Sakkar on 2/8/2017.
 */
public class MyThread extends Thread{
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("In "+name+" for "+i+" th time");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
