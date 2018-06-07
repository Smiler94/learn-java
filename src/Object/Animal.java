package Object;

public class Animal {
    private String name;
    private int id;

    public Animal(String name, int id) {
        this.name = name;
        this. id = id;
    }

    public void eat() {
        System.out.println(this.name+" eating");
    }

    public void sleep() {
        System.out.println(this.name+ " sleeping");
    }

    public void introduction() {
        System.out.println("hello, I am NO " + this.id + ", my name is "+this.name);
    }
}
