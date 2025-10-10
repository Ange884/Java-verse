abstract class LibraryUser {
    protected String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public abstract void accessLibrary();
}


class Book {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setAvailable(boolean available) { isAvailable = available; }
}


class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }
}

class Student extends Person {
    private String department;

    public Student(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
}

class Staff extends Person {
    public Staff(String name, String id) {
        super(name, id);
    }

    public void manageBook(Book book, boolean add) {
        if (add) {
            System.out.println(getName() + " added " + book.getTitle() + " to the library.");
        } else {
            System.out.println(getName() + " removed " + book.getTitle() + " from the library.");
        }
    }
}

// ------------------------
// Abstraction: StudentUser and StaffUser
// ------------------------
class StudentUser extends LibraryUser {
    public StudentUser(String name) { super(name); }

    @Override
    public void accessLibrary() {
        System.out.println(name + " borrows books from the library.");
    }
}

class StaffUser extends LibraryUser {
    public StaffUser(String name) { super(name); }

    @Override
    public void accessLibrary() {
        System.out.println(name + " manages the library resources.");
    }
}

// ------------------------
// Integration: LibraryDemo
// ------------------------
public class LibraryDemo {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("Python Essentials", "Jane Smith");

        // Create users
        Student student1 = new Student("Alice", "S1001", "CS");
        Staff staff1 = new Staff("Bob", "T2001");

        // ------------------------
        // Borrowing books
        // ------------------------
        student1.borrowBook(book1); // Alice borrows Java Basics
        student1.borrowBook(book2); // Alice borrows Python Essentials
        student1.borrowBook(book1); // Try borrowing already borrowed book

        // Returning books (make available again)
        book1.setAvailable(true);
        System.out.println(student1.getName() + " returned " + book1.getTitle());

        // ------------------------
        // Staff manages books
        // ------------------------
        staff1.manageBook(book1, true);  // Add book1
        staff1.manageBook(book2, false); // Remove book2

        // ------------------------
        // Polymorphism demonstration
        // ------------------------
        Person p1 = student1; // Student as Person
        Person p2 = staff1;   // Staff as Person

        if (p1 instanceof Student) {
            ((Student) p1).borrowBook(book1);
        }
        if (p2 instanceof Staff) {
            ((Staff) p2).manageBook(book2, true);
        }

        // ------------------------
        // Abstraction demonstration
        // ------------------------
        LibraryUser sUser = new StudentUser(student1.getName());
        LibraryUser tUser = new StaffUser(staff1.getName());

        sUser.accessLibrary();
        tUser.accessLibrary();
    }
}
