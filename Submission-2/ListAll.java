import java.io.File;

public class ListAll {
    public static void main(String[] args) {
        String dir = "C:\\Users\\sagar\\Documents\\idol\\Practicals\\java\\Submission-2";
        File f=new File(dir);
        if(f.isDirectory()){
            System.out.println( "Directory Name: " +f.getName()); 
            String name[]=f.list(); 
            for(int i=0; i<name.length; i++)
            { 
                File tmp=new File(dir+name[i]); 
                System.out.println(name[i]+" : ");
                System.out.println(tmp.isDirectory()? "is a Directroy" :"is a File");
            } 
        } 
        else{
            System.out.println(dir+" is not directory");
        }

    }
}
