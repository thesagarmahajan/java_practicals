import java.io.FileReader;
import java.io.FileWriter;

public class FileAlpha {
    public static void main(String[] args) {
        try{ 
            String name="C:\\Users\\sagar\\Documents\\idol\\Practicals\\java\\Submission-2\\alpha.txt";
            FileWriter fw=new FileWriter(name);
            FileReader fr=new FileReader(name); 

            for(char c='A'; c<='Z'; c++){
                fw.write(c);
            }
            fw.close();

            int x;
            while((x=fr.read()) != -1){
                System.out.println((char)x);
            }
            fr.close();
        }catch(Exception e){ 
            System.out.println(e.getMessage()); 
        }

    }
}
