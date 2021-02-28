import java.util.logging.Level;
import java.util.logging.Logger;

class CountThread extends Thread {
    int n;
    CountThread(String name, int n) {
        setName(name);
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(getName() + " : " + i);
            try {
                sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
public class Threading1 {
    public static void main(String args[])
    { 
        CountThread tl=new CountThread("Thread-I", 10);
        CountThread t2=new CountThread("Thread-II", 20);
        tl.start(); 
        t2.start(); 
    }    
} 