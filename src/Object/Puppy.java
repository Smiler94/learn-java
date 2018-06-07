package Object;

public class Puppy {
    int age;
    String name;

    public Puppy(String dName, int dAge) {
        name = dName;
        age = dAge;
    }

    public void setAge(int dAge) {
        age = dAge;
    }

    public void setName(String dName) {
        name = dName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy", 1);
        System.out.println("tommy: age:" + myPuppy.getAge() + ",name:" + myPuppy.getName());

        myPuppy.setName("tommy no.2");
        myPuppy.setAge(2);
        System.out.println("tommy no.2: age:" + myPuppy.getAge() + ",name:" + myPuppy.getName());
    }
}
