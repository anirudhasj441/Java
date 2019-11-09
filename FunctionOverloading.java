public class FunctionOverloading{
    public double area(double r){
        return(3.14*r*r);
    }

    public double area(double l,double b){
        return(l*b);
    }

    public static void main(String[] args) {
        FunctionOverloading obj =new FunctionOverloading();
        System.out.println("area of circle is:"+obj.area(5));
        System.out.println("area of circle is:"+obj.area(4,8));
    }
}