public class Overriding{
    public double squreArea(double a){
        return(a*a);
    }

    public static void main(String[] args) {
        Overriding obj = new Overriding();
        System.out.println("area of squre is: "+obj.squreArea(5));
        System.out.println("area of squre is: "+obj.squreArea(6));
    }
}