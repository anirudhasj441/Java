import java.io.*;

public class tcs
{
	public static void main(String[] args)throws IOException {
		int posX = 0 , posY = 0,x = 0, y = 0, turn =1 , n ;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("enter number of turns:");
		n = Integer.parseInt(dis.readLine());
		if (n < 2 || n> 1000)
			System.out.println("turn should in between 2 and 1000");
		else{
			while (turn <= n){
				if (turn %2 != 0){
					if (x%2==0){
						posX = posX +turn*10;
						x++;
					}
					else{
						posX =posX - turn*10;
					}
				}
				else {
					if (y %2==0){
						posY= posY+turn *10;
						y ++;
					}
					else{
						posY = posY - turn *10;
					}
				}
				turn ++;
			}
			System.out.println(posX+","+posY);
		}

	}
}