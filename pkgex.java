import java.io.*;
public class pkgex
{
	int a,b;
	InputStreamReader ir;
	BufferedReader br;
	public pkgex()
	{
		ir=new InputStreamReader(System.in);
		br=new BufferedRead(ir);
	}
	public int add()
	{
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args) throws IOException {
		pkgex obj=new pkgex();
		obj.add();
	}
}