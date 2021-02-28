import java.util.logging.Level;
import java.util.logging.Logger;
class CountThread2 implements Runnable {
    int n;
    CountThread2(int n) {
       
        this.n = n;
    }
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
public class Threading2 {
    public static void main(String args[])
    { 
        Thread t1=new Thread(new CountThread2(10));
        Thread t2=new Thread(new CountThread2(20));
        t1.setName("Thread-I");
        t1.setName("Thread-II");
        t1.start(); 
        t2.start(); 
    }    
} 