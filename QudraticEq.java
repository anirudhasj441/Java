import java.io.*;

public class QudraticEq{

	int a,b,c;

	QudraticEq(int a , int b , int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int temp(){
		int temp = (b*b)-(4*a*c);
		return temp;
	}

	public int root1(){
		int r1 = b - math.sqrt(temp());
		return r1;
	}

	public int root2(){
		int r2 = -(b - Math.sqrt(temp()));
		return r2;
	}

	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(System.in);

		int a = Integer.parseInt(dis.readLine());
		int b = Integer.parseInt(dis.readLine());
		int c = Integer.parseInt(dis.readLine());

		QudraticEq obj = new QudraticEq(a,b,c);
		System.out.println("r1 = "+obj.root1());
		System.out.println("r2 = "+obj.root2());
	}


}
