public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("dog" , 5,"husky");
        d.bark();
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(this.getName() + " is barking...");
    }
}