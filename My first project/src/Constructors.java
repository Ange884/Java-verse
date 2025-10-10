public class Constructors {

    public static class Computer {
        String brandName;

        public Computer(String brand) {
            this.brandName = brand;
        }

        public Computer() {
        }

        public void display() {
            System.out.println("Display running on " + brandName);
        }
    }

    public static class Laptop extends Computer {
        public Laptop() {
            super("computing machine");
        }

        @Override
        public void display() {
            super.display();
        }
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.display();
    }
}
