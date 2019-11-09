import java.util.Scanner;

class Histogram{
    public void histogram(int p,int q,int r){
        for(int i=0;i<p;i++){
            System.out.print("#");
        }
        System.out.println("");
        for(int i=0;i<q;i++){
            System.out.print("#");
        }
        System.out.println("");
        for(int i=0;i<r;i++){
            System.out.print("#");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Histogram obj = new Histogram();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data x,y,z");
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();
        System.out.print("z = ");
        int z = sc.nextInt();
        obj.histogram(x,y,z);
        sc.close();
    }
}