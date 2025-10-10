public class setter {
    static class Student{
        private String lastname;
        private String firstname;

    public void setFirstname(String first){
            this.firstname = first;
        }
        public String getFirstname(){
            return firstname;
        }

    }
    
    public static  void main(String[] args){
        Student one = new Student();
        one.setFirstname("Muheto");
        System.out.println("the set name is:" + one.getFirstname());
    }
}
