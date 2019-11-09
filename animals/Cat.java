package animals;

public class Cat implements Animals{
    public void run(){
        System.out.println("running");
    }

    public void eat(){
        System.out.println("eating");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.run();
        obj.eat();
    }
}