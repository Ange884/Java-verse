class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Student s = (Student) obj;
        return age == s.age && name.equals(s.name);
    }
}

public class equals {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Alice", 20);

        System.out.println(s1.equals(s2)); // true
    }
}
