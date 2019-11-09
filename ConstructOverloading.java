public class ConstructOverloading{
    int a,b,x,y,z;
    public ConstructOverloading(int a,int b){
        this.a = a;
        this.b = b;
    }

    public ConstructOverloading(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int addTwo(){
        return(a+b);
    }

    public int addThree(){
        return(x+y+z);
    }

    public static void main(String[] args) {
        ConstructOverloading obj1 = new ConstructOverloading(5, 6);
        ConstructOverloading obj2 = new ConstructOverloading(5, 6, 4);
        System.out.println("addition of two is: "+obj1.addTwo());
        System.out.println("addition of three is: "+obj2.addThree());
    }
}