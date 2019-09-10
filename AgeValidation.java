import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import sun.tools.java.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        try{
            System.out.print("enter your age:");
            int age = sc.nextInt();
            if (age<0){
                throw AgeException;
            }
            else if (age<18){
                System.out.println("you are kid!");
            }
            else{
                System.out.println("you are matured!");
            }
        }
        catch AgeException (es) {
            System.out.println(es);
        }
        
    }
}