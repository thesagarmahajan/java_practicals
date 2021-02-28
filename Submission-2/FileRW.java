import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileRW {
    public static void main(String[] args) {
        try
        { 
            String from="C:\\Users\\sagar\\Documents\\idol\\Practicals\\java\\Submission-2\\from.txt"; 
            String to= "C:\\Users\\sagar\\Documents\\idol\\Practicals\\java\\Submission-2\\to.txt"; 
            BufferedInputStream in=new BufferedInputStream( new FileInputStream(from));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(to));
            byte[] buff = new byte[1024];
            int len;
            while((len=in.read(buff))>0){
                out.write(buff, 0, len);
            }
            in.close();
            out.close();
            System.out.println("File Copied...");
        }
        catch(Exception e){
             System.out.println(e.getMessage()); 
        }
    }
}
