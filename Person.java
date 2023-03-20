public class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void yearPasses() {
        age++;
    }
    public String amIOld() {
        if (age <= 19) {
            return "Teenager";
        }else {
            return "Adult";
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person(18);
        person.yearPasses();
        System.out.println(person.amIOld());
        person.yearPasses();
        System.out.println(person.amIOld());
    }
}
