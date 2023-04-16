public class Polymorphism {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        Cat c = new Cat();
        d.makeSound();
        c.makeSound();
        c.makeSound(1);
    }
}
interface Animal1 {
    public void makeSound();
}
class Dog1 implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }

    public void makeSound(int index){
        System.out.println("meow meow meow");
    }
}