public class exrcise3{
	public void greaterThan(int x,int y, int z){
	 	if (x>y){
		 	if (x>z){
		 		System.out.println(x+"is greater");
			}
			else{
		 		System.out.println(z+"is greater");
			}
		}
		else{
			if (y>z){
			 	System.out.println(y+"is greater");
			}
			else{
			 	System.out.println(z+"is greater");
			}
		}
	}
		
	public static void main(String[] args) {
		int x,y,z;
		exrcise3 obj = new exrcise3();
		System.out.print("x=");
		x=Integer.parseInt(System.console().readLine());
		System.out.print("y=");
		y=Integer.parseInt(System.console().readLine());
		System.out.print("z=");
		z=Integer.parseInt(System.console().readLine());
		obj.greaterThan(x, y, z);
	}
}