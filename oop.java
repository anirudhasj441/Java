import java.util.Scanner;

public class oop 
{
	double pi =3.14;
	public double circle(float r){
		double area = pi*r*r;
		return area;
	}
	public float rect(float a, float b){
		float area=a*b;
		return area;
	}
	public float sqr(float a){
		float area=a*a;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter a no:");
		int a = sc.nextInt();

		oop obj= new oop();
		System.out.println("circle"+obj.circle(a));
		System.out.println("rect"+obj.rect(5,8));
		System.out.println("sqr"+obj.sqr(4)); 
	}
}