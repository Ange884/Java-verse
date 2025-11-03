import java.util.*;

public class EmployeeMain {
    public static class Employee {
        private String firstName;
        private String lastName;
        private int age;
        private int salary;

        public Employee(String firstName, String lastName, int age, int salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString(){
            return "Employee [firstname=" + firstName + ", lastname=" + lastName + ", age=" + age + ", salary=" + salary + "]";
        }
    }

    public static class SortAge implements Comparator<Employee>{
        public int compare(Employee a, Employee b){
            return Integer.compare(a.getAge(), b.getAge());
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Florence", "Wihogora", 16, 1000));
        list.add(new Employee("Amani", "Samuel", 20, 2000));
        list.add(new Employee("Gold", "Gold", 17, 1500));

        Collections.sort(list, new SortAge());

        Comparator<Employee> comp = new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b){
                if(a.getSalary() < b.getSalary()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(list, comp);
    }
}