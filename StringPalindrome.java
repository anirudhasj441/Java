import java.util.Scanner;

public class StringPalindrome{

    public String revString(String str){
        String revStr = "";
        char ch ;
        for(int i = str.length();i>=1;i--){
            // System.out.println(str.charAt(i-1));
            ch = str.charAt(i-1);
            revStr = revStr + ch;
        }
        return revStr;
    }

    public static void main(String[] args) {
        StringPalindrome obj = new StringPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String str = sc.nextLine();
        String revStr;
        revStr = obj.revString(str);
        System.out.println("reverse of "+str+" is "+revStr);
        if (revStr.equals(str)){
            System.out.println("its a palindrome!");
        }

    }
}