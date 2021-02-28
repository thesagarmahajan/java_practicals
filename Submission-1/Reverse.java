import java.util.Scanner;
class perform{
    void reverse(int n)
    { 
        int rev=0, d, no=n; 
        do
        { 
            d=n%10; 
            rev=rev*10+d; 
            n=n/10; 
        }while(n>0); 
        System.out.println("Number : "+no); 
        System.out.println("Reverse : "+rev); 
        if(no==rev){
            System.out.println(no+" is Palindrome");
        }
        else{
            System.out.println(no+" is NOT Palindrome");
        }
    }
    void reverse (String st) {
         StringBuffer sb=new StringBuffer (st); 
         String rev=sb.reverse().toString() ; 
         System.out.println ("String : "+st) ; 
         System.out.println ("Reverse : " +rev) ; 
         if (st . equals (rev) ) System. out .println (st + " is Palindrome") ; 
         else System. out.println (st + " is NOT Palindrome");
    } 
}
public class Reverse {
    public static void main(String args[]){ 
        Scanner sr=new Scanner(System.in); 
        System.out.print("Enter a number : "); 
        int x=sr.nextInt(); 
        System.out.print("Enter a string : "); 
        String y=sr.next(); 
        perform obj=new perform(); 
        obj.reverse(x); 
        obj.reverse (y);
    }
}
