public class Encapsulation {
    public static void main(String[] args) {
        People p = new People("Tam" , 26);
        Student s = new Student("Tam" , 26, "001");
        System.out.println(p.getName());
        s.talk();
    }
}

class People {
    private String name;
    private int age;

    public People (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    protected void talk(){
        System.out.println("My name is " + this.getName());
    }
}

class Student extends People {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name,age);
        this.studentId = studentId ;
    }
}