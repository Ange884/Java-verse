public  class Comp implements Comparable<Comp> {
    private int Age;

    public  Comp(int age) {
        this.Age = age;
    }

    public String toString() {
        return "(" + Age + ")";
    }

    public  int getAge(){
        return Age;
    }

    public  void setAge(int Age){
        Age = Age;
    }

    @Override
    public int compareTo(Comp o) {
        return 0;
    }
}