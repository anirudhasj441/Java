import java.util.Scanner;

public class AddMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int m = sc.nextInt();
        System.out.print("enter number of columns:");
        int n = sc.nextInt();
        int a[][] = new int [m][n];
        int b[][] = new int [m][n];
        int c[][] = new int [m][n];
        System.out.println("enter values for matrix A");
        for (int i=0;i<m;i++){
            // System.out.print("\t");
            for (int j=0;j<n;j++){
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j] = sc.nextInt();
                // System.out.println("");
            }
        }
        System.out.println("enter values for matrix B");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("b["+i+"]["+j+"]=");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("addition of matrix is:");
        for(int i=0;i<m;i++){
            System.out.println("");
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]);
                System.out.print("\t");
            }
        }
    }
}