import java.util.Scanner;
public class QudraticEq{
	public void quad(int a,int b,int c){
		double d = (b*b)-4*a*c;
		double sqr = Math.sqrt(d);
		if(d>0){
			System.out.println("roots are real and different!");
			double r1 = (-b+sqr)/2*a;
			double r2 = (-b-sqr)/2*a;
			System.out.println("roots are:"+r1+" and "+r2);
		}
		else if(d==0){
			System.out.println("roots are real and same!");
			double r1 = -b/2*a;
			System.out.println("root is "+r1);
		}
		else{
			System.out.println("roots are complex!");
			double r1 = (-b+sqr)/2*a;
			double r2 = (-b-sqr)/2*a;
			System.out.println("roots are:"+r1+" and "+r2);
		}
	}
	public static void main(String[] args) {
		QudraticEq obj = new QudraticEq();
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
		System.out.print("c=");
		int c = sc.nextInt();
		obj.quad(a, b, c);
		sc.close();
	}
}