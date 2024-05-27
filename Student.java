public class Student{
    public static void main(String[] args) {
        Student student_a = new Student("rtyuikl", "Dennis", 2345);
        System.out.println(student_a.name);
        student_a.learn();
    }

    String name;
    String ADM;
    int date_of_birth;

    public Student(String ADM, String name, int dob){
        this.ADM = ADM;
        this.name = name;
        this.date_of_birth = dob;
    }

    public void learn(){
        System.out.println("I'm excited to learn programming...");
    }
}