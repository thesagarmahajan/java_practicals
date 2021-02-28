import java.io.File;
import java.io.PrintStream;
public class FilePro {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\sagar\\Documents\\idol\\Practicals\\java\\Submission-2\\something.txt");

        PrintStream p=System.out; 
        p.println("File Name "+f1.getName());
        p.println("Path :"+f1.getPath());
        p.println("Parent :"+f1.getParent());
        p.println("Absolute Path :"+f1.getAbsolutePath()); 
        p.println(f1.exists()?"File exist":"File does not exist");
        p.println(f1.canWrite()?"It is Writeable":"It is not Writeable");
        p.println(f1.canRead()?"It is Readable":"It is not Readable") ;
        p.println(f1.isDirectory()?"It is a Directory":"It is not a directory");
        p.println(f1.isFile()?"It is a File":"It is not a File"); 
        p.println("Last Modified "+f1.lastModified()); 
        p.println("File Size :"+f1.length() ); 

    }
}
