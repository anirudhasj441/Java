public class demo
{
	double area;
	public double circleArea(int r)
	{
		area=3.14*r*r;
		return area;
	}
	public static void main(String args[]) {
		demo obj = new demo();



		System.out.println(obj.circleArea(5));
	}
	
}