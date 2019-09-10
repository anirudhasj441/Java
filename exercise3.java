public class exe rcise3
{
	public static void main(String[] args) {
		int x,y,z;
		System.out.print("x=");
		x=Integer.parseInt(System.console().readLine());
		System.out.print("y=");
		y=Integer.parseInt(System.console().readLine());
		System.out.print("z=");
		z=Integer.parseInt(System.console().readLine());
		if (x>y & x>z)
		{
			System.out.println(x+"is greater");
		}
		else if(y>x & y>z)
		{
			System.out.println(y+"is greater");
		}
		else if(z>x & z>y)
		{
			System.out.println(z+"is greater");
		}

	}
}