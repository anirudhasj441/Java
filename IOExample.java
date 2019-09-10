import java.io.*;

public class IOExample
{
	int a,b;
	IOExample(int a , int b){
		 this.a = a;
		 this.b = b;
	}

	public int add(){
		int sum= a + b;
		return sum;
	}
	public static void main(String[] args) throws IOException {
		DataInputStream dis =new DataInputStream(System.in);
		System.out.print("val1 = ");
		int c=Integer.parseInt(dis.readLine());
		System.out.print("val2 = ");
		int d=Integer.parseInt(dis.readLine());
		IOExample obj=new IOExample(c,d);
		System.out.println("sum = "+obj.add());
	}
}