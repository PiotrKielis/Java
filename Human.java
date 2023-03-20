public class Human {
    private int age;
    private String name;
    private double height;
    public Human() {}
    public Human(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(30);
        human1.setName("Jan Kowalski");
        human1.setHeight(1.8);

        Human human2 = new Human(25, "Anna Nowak", 1.6);

        System.out.println("Info about human 1:" + human1.getName() + ", " + human1.getAge() + "years old, " + human1.getHeight() + " m");
        System.out.println("Info about human 2:" + human2.getName() + ", " + human2.getAge() + "years old, " + human2.getHeight() + " m");

    }

}
