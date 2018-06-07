package Object;

public class Penguin extends Animal {
    public Penguin(String name, int id) {
        super(name, id);
    }

    public static void main(String args[]) {
        Penguin pen = new Penguin("tonny", 10);
        pen.introduction();
        pen.eat();
        pen.sleep();
    }
}
