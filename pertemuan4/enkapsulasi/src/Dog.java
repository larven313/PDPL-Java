import java.lang.reflect.Constructor;

public class Dog {
    String name, breed, color;
    int age;

    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Hi my name is " + this.name + "\n My breed, age and color are " + this.getBreed() + ", "
                + this.getAge() + ", " + this.getColor());
    }

    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "Papillion", "white", 4);
        System.out.println(tuffy.toString());
    }
}
