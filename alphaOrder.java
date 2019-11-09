import java.util.Scanner;

public class alphaOrder {
    
    
    public void order(String[] s){
        for (int i=0;i<s.length;i++){
            for (int j=i+1;j<s.length;j++){
                if (s[i].compareTo(s[j])>0){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(("ordered names are:"));
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        alphaOrder obj = new alphaOrder();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of strings:");
        int n = sc.nextInt();
        String name[] = new String[n];
        Scanner sc1 = new Scanner(System.in);
        for (int i=0;i<n;i++){
            name[i] = sc1.nextLine();
        }
        obj.order(name);
    }
}