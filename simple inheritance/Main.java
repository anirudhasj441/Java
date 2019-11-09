public class Main extends Add{
    public int sub(int a, int b){
        return (a-b);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("add = "+obj.add(5,4));
        System.out.println("sub = "+obj.sub(6, 2));
    }
}